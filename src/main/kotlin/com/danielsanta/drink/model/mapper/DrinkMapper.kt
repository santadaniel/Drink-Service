package com.danielsanta.drink.model.mapper

import com.danielsanta.drink.model.domain.Drink
import com.danielsanta.drink.model.entity.DrinkEntity
import com.danielsanta.drink.model.response.DrinkResponse

object DrinkMapper {
    fun DrinkEntity.toDomain() = Drink(id, name, price, type, volume)
    fun Drink.toResponse() = DrinkResponse(name, price, type, volume)
}