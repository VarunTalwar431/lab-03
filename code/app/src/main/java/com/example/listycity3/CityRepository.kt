package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(newCity:City, idx:Int){
        _cities[idx] = newCity
    }

    val cities: List<City>
        get() = _cities
}