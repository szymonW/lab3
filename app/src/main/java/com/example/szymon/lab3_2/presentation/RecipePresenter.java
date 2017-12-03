package com.example.szymon.lab3_2.presentation;

import com.example.szymon.lab3_2.domain.GetRecipes;
import com.example.szymon.lab3_2.domain.RecipeView;
import com.example.szymon.lab3_2.entity.Recipe;

public class RecipePresenter implements RecipeView {
    private RecipeView recipeView;
    public String string_recepie = new String();
    private boolean withMeat;
    private GetRecipes getRecipes = new GetRecipes();

    @Override
    public Recipe[] getRecipes(Recipe[] GetRecipes){
       return this.getRecipes.getRecipes(withMeat);
    }

    public void onAttach(RecipeView recipeView){
        this.recipeView = recipeView;
    }

    public void onDetach(){
        this.recipeView = null;
    }

    public void showRecipes(boolean isWithMeat){
        String string_recepie = new String();
        this.withMeat=isWithMeat;
        for (int i = 0; i < recipeView.getRecipes(new GetRecipes().getRecipes(isWithMeat)).length; i++){
            String name = recipeView.getRecipes(new GetRecipes().getRecipes(isWithMeat))[i].nazwa;
            String menu = recipeView.getRecipes(new GetRecipes().getRecipes(isWithMeat))[i].opis;
            string_recepie += name + " \t\t\t- \t\t\t" + menu + "\n";
        }
        this.string_recepie = string_recepie;
    }
}
