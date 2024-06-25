package com.danielsanta.drink.model.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

enum class DrinkType {
    HEALTHY, TASTY, CHEAP, EXPENSIVE
}

@Document(collection = "drinks")
data class DrinkEntity(
    @Id
    val id: String,
    val name: String,
    val price: BigDecimal,
    val type: DrinkType,
    val volume: Int
)