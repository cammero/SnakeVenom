package com.cameo;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Snake> listOfSnakes = new LinkedList<>();
        Snake rattlesnake = new Snake("Rattlesnake", 4);
        Snake seaSnake = new Snake("Sea Snake", 9);
        Snake greenMamba = new Snake("Green Mamba", 9);
        Snake cobra = new Snake("Cobra", 5);
        Snake boaConstrictor = new Snake("Boa Constrictor", 0);

        listOfSnakes.add(rattlesnake);
        listOfSnakes.add(seaSnake);
        listOfSnakes.add(greenMamba);
        listOfSnakes.add(cobra);
        listOfSnakes.add(boaConstrictor);

        System.out.println(listOfSnakes.toString());
        Collections.sort(listOfSnakes, new SnakeComparator());
        System.out.println(listOfSnakes.toString());
    }
}