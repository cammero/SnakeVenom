package com.cameo;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Snake> listOfSnakes = new LinkedList<>();

        //Instantiate snake objects and add them to listOfSnakes
        Snake rattlesnake = new Snake("Rattlesnake", 4);
        listOfSnakes.add(rattlesnake);

        Snake seaSnake = new Snake("Sea Snake", 9);
        listOfSnakes.add(seaSnake);

        Snake greenMamba = new Snake("Green Mamba", 9);
        listOfSnakes.add(greenMamba);

        Snake cobra = new Snake("Cobra", 5);
        listOfSnakes.add(cobra);

        Snake boaConstrictor = new Snake("Boa Constrictor", 0);
        listOfSnakes.add(boaConstrictor);

        //Sort list by venomRating, descending
        Collections.sort(listOfSnakes, new SnakeComparator());
        System.out.println(listOfSnakes.toString());
    }
}