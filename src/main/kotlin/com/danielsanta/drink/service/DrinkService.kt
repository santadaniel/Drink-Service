package com.danielsanta.drink.service

import com.danielsanta.drink.model.domain.Drink
import com.danielsanta.drink.model.mapper.DrinkMapper.toDomain
import com.danielsanta.drink.repository.DrinkRepository
import org.springframework.stereotype.Service

@Service
class DrinkService(private val drinkRepository: DrinkRepository) {
    fun getDrinks(): List<Drink> {
        return drinkRepository.findAll().map { it.toDomain() }
    }
}