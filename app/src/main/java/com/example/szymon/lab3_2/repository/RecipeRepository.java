package com.example.szymon.lab3_2.repository;

import com.example.szymon.lab3_2.entity.Recipe;

import java.util.ArrayList;
import java.util.List;


public class RecipeRepository {
    private Recipe miesny1= new Recipe("Kebab normal", "Bulka, miecho, salatka, sos", true);
    private Recipe miesny2= new Recipe("Kebab ostry", "Bulka, miecho, kapusta, sos ostry", true);
    private Recipe miesny3= new Recipe("Kebab bbq", "Bulka, miecho, pomidor, sos BBQ", true);
    private Recipe wege1= new Recipe("Kebab wege1", "Bulka, burak, pomidor, sos", false);
    private Recipe wege2= new Recipe("Kebab wege2", "Bulka, ser, pomidor, sos BBQ", false);
    private Recipe wege3= new Recipe("Kebab wege3", "Bulka, salatka, sos ostry", false);

    List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> getList(){
        this.recipes.add(miesny1);
        this.recipes.add(miesny2);
        this.recipes.add(miesny3);
        this.recipes.add(wege1);
        this.recipes.add(wege2);
        this.recipes.add(wege3);
        return recipes;
    }

}
