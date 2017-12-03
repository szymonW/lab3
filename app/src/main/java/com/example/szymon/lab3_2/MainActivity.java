package com.example.szymon.lab3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


import com.example.szymon.lab3_2.domain.GetRecipes;
import com.example.szymon.lab3_2.domain.RecipeView;
import com.example.szymon.lab3_2.presentation.RecipePresenter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final RecipePresenter recipePresenter = new RecipePresenter();
        recipePresenter.onAttach(recipePresenter.recipeView); //??
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox vege = (CheckBox) findViewById(R.id.checkBox);

        Button przycisk = (Button) findViewById(R.id.button);
        przycisk.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        TextView wyswietl = (TextView) findViewById(R.id.textView);
                        recipePresenter.showRecipes(vege.isChecked());
                        String string_recepie = recipePresenter.string_recepie;
                        wyswietl.setText(string_recepie);
                    }
                }
        );

    }
    @Override
    protected void onDestroy() {
        final RecipePresenter recipePresenter = new RecipePresenter();
        recipePresenter.onDetach();
        super.onDestroy();
    }
}