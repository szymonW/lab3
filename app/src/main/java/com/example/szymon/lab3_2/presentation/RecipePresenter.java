package com.example.szymon.lab3_2.presentation;

import com.example.szymon.lab3_2.domain.GetRecipes;
import com.example.szymon.lab3_2.domain.RecipeView;
import com.example.szymon.lab3_2.entity.Recipe;

public class RecipePresenter implements RecipeView {
    public RecipeView recipeView;
    public String string_recepie = new String();
    public GetRecipes getRecipes = new GetRecipes();


    public void showRecipes(boolean isWithMeat){

        String string_recepie = new String();
        for (int i = 0; i < getRecipes.getRecipes(isWithMeat).length; i++){
            String name =  getRecipes.getRecipes(isWithMeat)[i].nazwa;
            String menu =  getRecipes.getRecipes(isWithMeat)[i].opis;
            string_recepie += name + " \t\t\t- \t\t\t" + menu + "\n";
        }
        this.string_recepie = string_recepie;
    }

    public void onAttach(RecipeView recipeView){
        this.recipeView = recipeView;
    }

    public void onDetach(){
        this.recipeView = null;
    }

}

