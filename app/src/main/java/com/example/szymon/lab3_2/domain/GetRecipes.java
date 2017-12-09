package com.example.szymon.lab3_2.domain;

import com.example.szymon.lab3_2.entity.Recipe;
import com.example.szymon.lab3_2.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;


public class GetRecipes {
    RecipeRepository reciperepository = new RecipeRepository();
    public List<Recipe> getRecipes(boolean isWithMeat){
        List<Recipe> Lista = new ArrayList<>(6);
        if (isWithMeat == false){
            return reciperepository.getList();
        }else{
            int j=0;
            for (int i = 0; i < reciperepository.getList().size(); i++) {
                if (reciperepository.getList().get(i).typ_dania == false){
                    Lista.add(reciperepository.getList().get(i));
                }
            }
//            List<Recipe> Lista2 =  new ArrayList<>();
//            for (int i=0;i<j;i++){
//                Lista2.add(Lista.get(i));
//            }
            return Lista;
        }
    }

}
