package com.cameo;

/**
 * Created by Cameo on 11/30/2015.
 */
public class Snake {
    String species;
    double venomRating;

    public Snake(String s, double v){
        this.species = s;
        this.venomRating = v;
    }

    @Override
    public String toString(){
        return species + ": " + venomRating;
    }
}
