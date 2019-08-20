package com.lambdaschool.lambdamodules.activity

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import com.lambdaschool.lambdamodules.R
import com.lambdaschool.lambdamodules.activity.ModuleDetailsActivity.Companion.GITHUB_DETAILS_REQUEST_KEY
import com.lambdaschool.lambdamodules.model.ModuleItem
import kotlinx.android.synthetic.main.activity_git_hub_details.*

class GitHubDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_hub_details)

        // Pull in passed info from MainActivity
        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            val passedInfo = bundle.getSerializable(GITHUB_DETAILS_REQUEST_KEY) as ModuleItem


            // If it's a Sprint Challenge, change sub titles
            if (passedInfo.title.contains("Sprint Challenge")) {
                tv_github_demo_one_title.text = "After Hours Demo Repo:"
                tv_github_guided_project_title.text = "My Sprint Challenge Repo:"
            }

            // Load text views
            tv_github_demo_one_url.text = passedInfo.demoGitHubUrl
            tv_github_demo_two_url.text = passedInfo.demoTwoGitHubUrl
            tv_github_guided_project_url.text = passedInfo.projectGitHubUrl

            // If no 1st demo data, collapse that layout
            if (passedInfo.demoGitHubUrl == "") {
                tv_github_demo_one_title.text = ""
                ll_github_one.layoutParams = LinearLayout.LayoutParams(0,0)
                tv_github_demo_one_url.layoutParams = LinearLayout.LayoutParams(0,0)
            }

            // If no 2nd demo data, collapse that layout
            if (passedInfo.demoTwoGitHubUrl == "") {
                tv_github_demo_two_title.text = ""
                ll_github_two.layoutParams = LinearLayout.LayoutParams(0,0)
                tv_github_demo_two_url.layoutParams = LinearLayout.LayoutParams(0,0)
            }

            // Copy button listeners
            btn_github_demo_one.setOnClickListener {
                copyToClipboard(passedInfo.demoGitHubUrl)
            }

            btn_github_demo_two.setOnClickListener {
                copyToClipboard(passedInfo.demoTwoGitHubUrl)
            }

            btn_github_guided_project.setOnClickListener {
                copyToClipboard(passedInfo.projectGitHubUrl)
            }
        }
    }

    private fun copyToClipboard(text: CharSequence) {
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val myClip = ClipData.newPlainText("", text)
        clipboard.setPrimaryClip(myClip)
        Toast.makeText(this, "Coppied to clipboard:\n$text", Toast.LENGTH_SHORT).show()
    }
}
