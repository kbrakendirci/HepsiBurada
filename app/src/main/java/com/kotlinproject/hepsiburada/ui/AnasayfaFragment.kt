package com.kotlinproject.hepsiburada.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlinproject.hepsiburada.R
import com.kotlinproject.hepsiburada.adapters.CategoryCardAdapter
import com.kotlinproject.hepsiburada.adapters.IntroductionCardAdapter
import com.kotlinproject.hepsiburada.adapters.IntroductionCardAdapter2
import com.kotlinproject.hepsiburada.adapters.PromotionAdapter
import com.kotlinproject.hepsiburada.data.CategoryData
import com.kotlinproject.hepsiburada.data.IntroductionData
import com.kotlinproject.hepsiburada.data.IntroductionData2
import com.kotlinproject.hepsiburada.data.PromotionData


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:View
    private lateinit var dataSet:ArrayList<CategoryData>
    private lateinit var promotionDataSet:ArrayList<PromotionData>
    private lateinit var introductionDataSet:ArrayList<IntroductionData>
    private lateinit var introductionDataSet2:ArrayList<IntroductionData2>
    private lateinit var layoutmanager: RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim=inflater.inflate(R.layout.fragment_anasayfa, container, false)
        val img :CardView=tasarim.findViewById(R.id.imageView4)
        //img.setBackgroundResource(R.drawable.onboard);
        dataSet=ArrayList<CategoryData>()
        dataSet.add(CategoryData("Market","alisverissepeti"))
        dataSet.add(CategoryData("Çekiliş","sanstopu"))
        dataSet.add(CategoryData("Uçak Bileti","ucak"))
        dataSet.add(CategoryData("Su","water"))
        dataSet.add(CategoryData("Anne Çocuk","korel"))
        dataSet.add(CategoryData("Teknoloji Dünyasi","teknolojitutkulari"))
        dataSet.add(CategoryData("Moda Dünyası","modadunyasi"))
        dataSet.add(CategoryData("KitapSeverler","kitapseverler"))

        val rv:RecyclerView=tasarim.findViewById(R.id.categoryRecycleView)
        rv.layoutManager= StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        rv.adapter= CategoryCardAdapter(dataSet,requireContext())

        promotionDataSet=ArrayList<PromotionData>()
        promotionDataSet.add(PromotionData("Sana Özel","diamond","Fırsatlar seni bekliyor"))
        promotionDataSet.add(PromotionData("4x4","percentage","8 kampanya var"))

        val rvpromotion:RecyclerView=tasarim.findViewById(R.id.onBoardRecyclerView)
        rvpromotion.layoutManager= StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        rvpromotion.adapter= PromotionAdapter(promotionDataSet,requireContext())


        introductionDataSet=ArrayList<IntroductionData>()
        introductionDataSet.add(IntroductionData("Konum","location","Lütfen Konum Seçin"))


        val rvintroduction:RecyclerView=tasarim.findViewById(R.id.introductionRecycleView)
        rvintroduction.layoutManager= StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)
        rvintroduction.adapter= IntroductionCardAdapter(introductionDataSet,requireContext())



        introductionDataSet2=ArrayList<IntroductionData2>()
        introductionDataSet2.add(IntroductionData2("hepsipayedit"))



        val rvintroduction2:RecyclerView=tasarim.findViewById(R.id.introductionRecycleView2)
        rvintroduction2.layoutManager= StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)
        rvintroduction2.adapter= IntroductionCardAdapter2(introductionDataSet2,requireContext())



        return tasarim
        }

}