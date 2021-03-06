package com.lambdaschool.lambdamodules.adapter

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.lambdamodules.R
import com.lambdaschool.lambdamodules.activity.ModuleDetailsActivity
import com.lambdaschool.lambdamodules.activity.MainActivity.Companion.MODULE_DETAILS_REQUEST_KEY
import com.lambdaschool.lambdamodules.model.ModuleItem
import kotlinx.android.synthetic.main.activity_item_layout.view.*

class ModuleListAdapter(private val data: Array<ModuleItem>) :
    RecyclerView.Adapter<ModuleListAdapter.ViewHolder>() {

    lateinit var context: Context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.tv_main_card_title
        val lectureId: TextView = view.tv_main_card_lecture_id
        val description: TextView = view.tv_main_card_description
        val cardView: CardView = view.cardView
    }

    fun setEnterAnimation(animationView: View, position: Int) {
        val animation: Animation = AnimationUtils.loadAnimation(animationView.context, R.anim.my_slide_in_left)
        animationView.startAnimation(animation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_layout, parent, false)
        context = parent.context
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = data[position].title
        holder.description.text = data[position].description
        holder.lectureId.text = data[position].lectureId.toString()

        holder.cardView.setOnClickListener {
            val intent = Intent(context, ModuleDetailsActivity::class.java)
            intent.putExtra(MODULE_DETAILS_REQUEST_KEY, data[position])
            //(context as Activity).startActivity(intent)

            val optionsBundle: Bundle = ActivityOptions.makeSceneTransitionAnimation(context as Activity, holder.title, "shared_title").toBundle()

            context.startActivity(intent, optionsBundle)
        }
        setEnterAnimation(holder.cardView, position)
    }

}