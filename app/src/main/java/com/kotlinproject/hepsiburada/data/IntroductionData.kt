package com.kotlinproject.hepsiburada.data

import java.io.Serializable

data class IntroductionData(var introductionName:String, var introductionImage:String, var introductionDescription:String) :
    Serializable {
}
