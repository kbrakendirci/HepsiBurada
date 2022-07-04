package com.kotlinproject.hepsiburada.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject.hepsiburada.R
import com.kotlinproject.hepsiburada.data.IntroductionData2

class IntroductionCardAdapter2(var introductiondata: ArrayList<IntroductionData2>, var mContext: Context)
    : RecyclerView.Adapter<IntroductionCardAdapter2.IntroductionCardAdapterViewHolder>() {
    inner class IntroductionCardAdapterViewHolder(view: View): RecyclerView.ViewHolder(view){

        lateinit var imagecard : ImageView

        init {

            imagecard=view.findViewById(R.id.imagecard)

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IntroductionCardAdapterViewHolder {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.hepsipaycard,parent,false)
        return IntroductionCardAdapterViewHolder(tasarim)

    }

    override fun onBindViewHolder(holder: IntroductionCardAdapterViewHolder, position: Int) {
        val introductiondata =introductiondata[position]
        holder.imagecard.setImageResource(mContext.resources.getIdentifier(introductiondata.introductionImage,"drawable",mContext.packageName))


    }

    override fun getItemCount(): Int {
        return introductiondata.size
    }


}