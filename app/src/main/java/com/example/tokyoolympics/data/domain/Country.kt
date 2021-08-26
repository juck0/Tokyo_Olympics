package com.example.tokyoolympics.data.domain

 data class Country(
  val rank : Int,
  val team : String,
  val goldMedal : Int,
  val silverMedal : Int,
  val bronzeMedal : Int,
  val total : Int,
 )