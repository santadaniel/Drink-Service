package com.danielsanta.drink.model.domain

import com.danielsanta.drink.model.entity.DrinkType
import java.math.BigDecimal

data class Drink(
    val id: String,
    val name: String,
    val price: BigDecimal,
    val type: DrinkType,
    val volume: Int
)