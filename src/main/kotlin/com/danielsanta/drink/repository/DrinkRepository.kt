package com.danielsanta.drink.repository

import com.danielsanta.drink.model.entity.DrinkEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DrinkRepository : MongoRepository<DrinkEntity, String>