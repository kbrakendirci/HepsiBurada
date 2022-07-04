package com.kotlinproject.hepsiburada.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.hepsiburada.R
import com.kotlinproject.hepsiburada.data.IntroductionData


class IntroductionCardAdapter (var introductiondata :List<IntroductionData>, var mContext: Context)
    : RecyclerView.Adapter<IntroductionCardAdapter.IntroductionAdapterViewHolder>() {
    inner class IntroductionAdapterViewHolder(view: View): RecyclerView.ViewHolder(view){

        lateinit var imagecard : ImageView
        lateinit var descriptioncard: TextView
        lateinit var titlecard: TextView

        init {

            imagecard=view.findViewById(R.id.imagecard)
            descriptioncard=view.findViewById(R.id.descriptioncard)
            titlecard=view.findViewById(R.id.titlecard)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IntroductionAdapterViewHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.introductioncardview,parent,false)
        return IntroductionAdapterViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: IntroductionAdapterViewHolder, position: Int) {
        val introductiondata =introductiondata[position]

        holder.titlecard.text=introductiondata.introductionName
        holder.imagecard.setImageResource(mContext.resources.getIdentifier(introductiondata.introductionImage,"drawable",mContext.packageName))
        holder.descriptioncard.text=introductiondata.introductionDescription
    }

    override fun getItemCount(): Int {
        return introductiondata.size
    }


}