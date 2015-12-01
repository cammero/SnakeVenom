package com.cameo;

import java.util.Comparator;

/**
 * Created by Cameo on 11/30/2015.
 */
//http://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort
public class SnakeComparator implements Comparator<Snake> {
    @Override
    public int compare(Snake s1, Snake s2){
        //compares venomRating and sorts by highest first
        if(s1.venomRating > s2.venomRating) {
            return -1;
        }else if(s1.venomRating < s2.venomRating) {
            return 1;
        }else{
            //If venomRating comparison does not return -1 or 1, (which would mean it
            // returns 0), sort species in alphabetical order
            return s1.species.compareTo(s2.species);
        }
    }
}
