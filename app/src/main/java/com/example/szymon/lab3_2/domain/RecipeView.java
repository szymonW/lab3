package com.example.szymon.lab3_2.domain;

import com.example.szymon.lab3_2.entity.Recipe;

public interface RecipeView {
    public void showRecipes(Recipe[] GetRecipes);
}
