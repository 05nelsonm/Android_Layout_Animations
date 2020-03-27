package com.lambdaschool.lambdamodules.activity

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.view.Window
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lambdaschool.lambdamodules.model.ModuleItem
import com.lambdaschool.lambdamodules.R
import com.lambdaschool.lambdamodules.activity.MainActivity.Companion.MODULE_DETAILS_REQUEST_KEY
import kotlinx.android.synthetic.main.activity_module_details.*

class ModuleDetailsActivity : AppCompatActivity() {

    companion object {
        const val GITHUB_DETAILS_REQUEST_KEY = "A908IBNFPOIUN10397BRGN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Slide()
        window.exitTransition = Fade()
        setContentView(R.layout.activity_module_details)

        // Pull in passed info from MainActivity
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            val passedInfo = bundle.getSerializable(MODULE_DETAILS_REQUEST_KEY) as ModuleItem

            // Set TextView's with passed data
            tv_module_title.text = passedInfo.title
            tv_module_description.text = passedInfo.description

            // If it's a Sprint Challenge, change button text
            if (passedInfo.title.contains("Sprint Challenge")) {
                btn_demo.text = "After Hours Demo"
                btn_project.text = "Sprint Challenge"
            }

            // Open lecture demo one application
            btn_github.setOnClickListener {
                val intent = Intent(this, GitHubDetailsActivity::class.java)
                intent.putExtra(GITHUB_DETAILS_REQUEST_KEY, passedInfo)
                startActivity(intent)
            }

            // Open lecture demo one application
            btn_demo.setOnClickListener {
                openApp(this, passedInfo.demoPackageName)
            }

            // Open lecture demo two application. If there is no data, remove the button
            if (passedInfo.demoTwoPackageName != "") {
                btn_demo.setOnClickListener {
                    openApp(this, passedInfo.demoTwoPackageName)
                }
            } else {
                btn_demo_two.layoutParams = LinearLayout.LayoutParams(0,0)
            }

            // Open lecture guided project application
            btn_project.setOnClickListener {
                openApp(this, passedInfo.projectPackageName)
            }
        }
    }

    // https://stackoverflow.com/questions/2780102/open-another-application-from-your-own-intent/7596063#7596063
    private fun openApp(context: Context, packageName: String) {
        val manager: PackageManager = context.packageManager
        val intent = manager.getLaunchIntentForPackage(packageName)
        if (intent != null) {
            intent.addCategory(Intent.CATEGORY_LAUNCHER)
            context.startActivity(intent)
        } else {
            Toast.makeText(context, "Application package does not exist", Toast.LENGTH_SHORT).show()
        }
        //println("---- openApp INTENT---- : $intent")
    }
}