package com.example.tokyoolympics.util

import com.example.tokyoolympics.data.domain.Country

class CsvParser {
    fun parse(line: String): Country{
        val tokens = line.split(",")
        return Country(
            rank = tokens[Constants.ColumnIndex.RANK].toInt(),
            team = tokens[Constants.ColumnIndex.TEAM],
            goldMedal = tokens[Constants.ColumnIndex.GOLD_MEDAL].toInt(),
            silverMedal = tokens[Constants.ColumnIndex.SILVER_MEDAL].toInt(),
            bronzeMedal = tokens[Constants.ColumnIndex.BRONZE_MEDAL].toInt(),
            total = tokens[Constants.ColumnIndex.TOTAL].toInt(),

        )


    }



}