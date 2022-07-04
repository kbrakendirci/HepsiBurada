package com.kotlinproject.hepsiburada.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.hepsiburada.R
import com.kotlinproject.hepsiburada.data.PromotionData


class PromotionAdapter(var dataSet:List<PromotionData>, var mContext: Context)
    : RecyclerView.Adapter<PromotionAdapter.PromotionAdapterViewHolder>() {
    inner class PromotionAdapterViewHolder(view: View):RecyclerView.ViewHolder(view){

        lateinit var imagecard : ImageView
        lateinit var descriptioncard: TextView
        lateinit var titlecard: TextView

        init {

            imagecard=view.findViewById(R.id.imagecard)
            descriptioncard=view.findViewById(R.id.descriptioncard)
            titlecard=view.findViewById(R.id.titlecard)
        }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromotionAdapterViewHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.cardviewdesign,parent,false)
        return PromotionAdapterViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: PromotionAdapterViewHolder, position: Int) {
        val promotion =dataSet[position]

        holder.titlecard.text=promotion.promotionName
        holder.imagecard.setImageResource(mContext.resources.getIdentifier(promotion.promotionImage,"drawable",mContext.packageName))
        holder.descriptioncard.text=promotion.promotionDescription

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}