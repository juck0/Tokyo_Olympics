package com.example.tokyoolympics.data

import com.example.tokyoolympics.data.domain.Country

object DataManger {

    val countryList = mutableListOf<Country>()
    private var countryIndex = 0
    fun addCountry(country: Country){
        countryList.add(country)
    }
    fun getCurrentCountry(): Country = countryList[countryIndex]
    fun getNextCountry(): Country {
        countryIndex++
        if (countryIndex == countryList.size){
            countryIndex = 0
        }
        return countryList[countryIndex]
    }
    fun getPreviousCountry(): Country{
        countryIndex--
        if (countryIndex == -1){
            countryIndex = countryList.size - 1}
        return countryList[countryIndex]
    }

}