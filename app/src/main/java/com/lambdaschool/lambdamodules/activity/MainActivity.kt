package com.lambdaschool.lambdamodules.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.lambdamodules.adapter.ModuleListAdapter
import com.lambdaschool.lambdamodules.R
import com.lambdaschool.lambdamodules.`object`.AllOfTheDatas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val MODULE_DETAILS_REQUEST_KEY: String = "AP9SNIDF924BIH3BVC98B"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ModuleListAdapter(AllOfTheDatas.lectureData)
        list_view.layoutManager = manager
        list_view.adapter = adapter
    }
}
