package com.danielsanta.drink.model.response

import com.danielsanta.drink.model.entity.DrinkType
import java.math.BigDecimal

data class DrinkResponse(
    val name: String,
    val price: BigDecimal,
    val type: DrinkType,
    val volume: Int
)