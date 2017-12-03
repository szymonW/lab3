package com.example.szymon.lab3_2.domain;

import com.example.szymon.lab3_2.entity.Recipe;
import com.example.szymon.lab3_2.repository.RecipeRepository;


public class GetRecipes {
    RecipeRepository reciperepository = new RecipeRepository();
    public Recipe[] getRecipes(boolean isWithMeat){
        Recipe[] Lista = new Recipe[reciperepository.getList().length];
        if (isWithMeat == false){
            Lista = reciperepository.getList();
            return Lista;
        }else{
            int j=0;
            for (int i = 0; i < reciperepository.getList().length; i++) {
                if (reciperepository.getList()[i].typ_dania == false){
                    Lista[j++]=reciperepository.getList()[i];
                }
            }
            Recipe[] Lista2 = new Recipe[j];
            for (int i=0;i<j;i++){
                Lista2[i]=Lista[i];
            }
            return Lista2;
        }
    }

}
