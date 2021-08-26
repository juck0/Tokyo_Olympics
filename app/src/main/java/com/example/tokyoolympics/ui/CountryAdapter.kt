package com.example.tokyoolympics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympics.R
import com.example.tokyoolympics.data.domain.Country
import com.example.tokyoolympics.databinding.ItemCountryBinding
import com.example.tokyoolympics.ui.CountryAdapter.CountryViewHolder

class CountryAdapter(val list: List<Country>) : RecyclerView.Adapter<CountryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry =list[position]
        holder.binding.apply {
            rank.text = currentCountry.rank.toString()
            countryName.text = currentCountry.team
            goldMedal.text = currentCountry.goldMedal.toString()
            silverMedal.text = currentCountry.silverMedal.toString()
            bronzeMedal.text = currentCountry.bronzeMedal.toString()
            total.text = currentCountry.total.toString()

        }
    }

    override fun getItemCount() = list.size

    class CountryViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val binding = ItemCountryBinding.bind(viewItem)
    }
}
