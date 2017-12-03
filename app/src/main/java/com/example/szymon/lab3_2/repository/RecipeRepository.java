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

    Recipe[] recipes = new Recipe[6];

    public Recipe[] getList(){
            this.recipes[0]=miesny1;
            this.recipes[1]=miesny2;
            this.recipes[2]=miesny3;
            this.recipes[3]=wege1;
            this.recipes[4]=wege2;
            this.recipes[5]=wege3;
            return recipes;
    }

//    @Override
//    public String toString() {
//        return "RecipeRepository{" +
//                "recepies=" + recepies +
//                ", miesny1=" + miesny1 +
//                ", miesny2=" + miesny2 +
//                ", miesny3=" + miesny3 +
//                ", wege1=" + wege1 +
//                ", wege2=" + wege2 +
//                ", wege3=" + wege3 +
//                ", recipesList=" + recipesList +
//                '}';
//    }
}
