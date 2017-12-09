package com.example.szymon.lab3_2.presentation;

import com.example.szymon.lab3_2.domain.GetRecipes;
import com.example.szymon.lab3_2.domain.RecipeView;

public class RecipePresenter implements RecipeView {
    public RecipeView recipeView;
    public String string_recepie = new String();
    public GetRecipes getRecipes = new GetRecipes();

    @Override
    public void showRecipes(boolean isWithMeat){

        String string_recepie = new String();
        int k;
        if (isWithMeat){
            k=3;
        }else{
            k=6;
        }
        for (int i = 0; i < k; i++){
            String name =  getRecipes.getRecipes(isWithMeat).get(i).nazwa;
            String menu =  getRecipes.getRecipes(isWithMeat).get(i).opis;
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

