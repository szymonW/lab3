package com.example.szymon.lab3_2.entity;


public class Recipe {
    public String nazwa;
    public String opis;
    public boolean typ_dania;
    public Recipe(String nazwa, String opis, boolean typ_dania){
        this.nazwa = nazwa;
        this.opis = opis;
        this.typ_dania = typ_dania;
    }
}
