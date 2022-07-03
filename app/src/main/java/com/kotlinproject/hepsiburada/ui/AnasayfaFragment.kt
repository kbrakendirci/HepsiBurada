package com.kotlinproject.hepsiburada.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kotlinproject.hepsiburada.R
import com.kotlinproject.hepsiburada.adapters.CategoryCardAdapter
import com.kotlinproject.hepsiburada.data.CategoryData


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:View
    private lateinit var dataSet:ArrayList<CategoryData>
    private lateinit var layoutmanager: RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim=inflater.inflate(R.layout.fragment_anasayfa, container, false)
        dataSet=ArrayList<CategoryData>()
        dataSet.add(CategoryData("Market","alisverissepeti"))
        dataSet.add(CategoryData("Kazandıran Çekiliş","sanstopu"))
        dataSet.add(CategoryData("Uçak Bileti","ucak"))
        dataSet.add(CategoryData("Dondurma","ice_cream"))
        dataSet.add(CategoryData("Su","water"))
        dataSet.add(CategoryData("Anne Çocuk","korel"))
        dataSet.add(CategoryData("Su","water"))
        dataSet.add(CategoryData("Anne Çocuk","korel"))

        val rv:RecyclerView=tasarim.findViewById(R.id.categoryRecycleView)
        rv.layoutManager= StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        rv.adapter= CategoryCardAdapter(dataSet,requireContext())


        return tasarim
        }

}