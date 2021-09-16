package com.example.food_recipes.bindingAdapters

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.food_recipes.adapters.FavoriteRecipesAdapter
import com.example.food_recipes.data.database.entities.FavoritesEntity

class FavoriteRecipesBinding {

    companion object {

        @BindingAdapter("setVisibility", "setData", requireAll = false)
        @JvmStatic
        fun setVisibility(view: View, favoritesEntity: List<FavoritesEntity>?, mAdapter: FavoriteRecipesAdapter?) {
            when (view) {
                is RecyclerView -> {
                    val hasData = !favoritesEntity.isNullOrEmpty()
                    view.isVisible = hasData
                    if(hasData) {
                        favoritesEntity?.let { mAdapter?.setData(it) }
                    }
                }
                else -> view.isVisible = favoritesEntity.isNullOrEmpty()
            }
        }
    }
}