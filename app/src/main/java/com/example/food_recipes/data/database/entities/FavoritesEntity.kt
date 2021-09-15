package com.example.food_recipes.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.food_recipes.models.Result
import com.example.food_recipes.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val result: Result
)