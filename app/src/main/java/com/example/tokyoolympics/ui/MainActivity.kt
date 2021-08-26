package com.example.tokyoolympics.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tokyoolympics.data.DataManger
import com.example.tokyoolympics.data.domain.Country
import com.example.tokyoolympics.databinding.ActivityMainBinding
import com.example.tokyoolympics.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader
class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUp()
        addCallBacks()


    }

     fun addCallBacks() {


    }


    fun setUp(){
        parseFile()
        val adapter = CountryAdapter(DataManger.countryList)
        binding?.recyclerCountry?.adapter = adapter
    }



    private fun  parseFile(){
        val inputStream = assets.open("tokyo_2021.csv")
        val buffer =BufferedReader(InputStreamReader(inputStream))
        val parser = CsvParser()
        buffer.forEachLine {
            val currentCountry = parser.parse(it)
            DataManger.addCountry(currentCountry)
        }


    }


}