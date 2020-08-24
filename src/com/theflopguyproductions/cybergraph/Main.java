package com.theflopguyproductions.cybergraph;

import java.util.ArrayList;

public class Main {

     private static final ArrayList<Integer> inputList = new ArrayList<>();

    public static void main(String[] args){

//        setupListOne();

        setupListTwo();

        GraphCreator graphCreator = new GraphCreator(inputList);
        graphCreator.computeGraph();

    }

    private static void setupListTwo() {
        inputList.add(3);
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(3);

        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(3);
        inputList.add(2);
        inputList.add(5);
        inputList.add(4);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(1);
        inputList.add(2);
        inputList.add(6);
        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(2);
        inputList.add(3);
        inputList.add(6);
        inputList.add(3);
        inputList.add(2);
        inputList.add(3);
        inputList.add(1);
        inputList.add(5);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(4);
        inputList.add(2);
        inputList.add(1);
        inputList.add(8);
        inputList.add(1);
        inputList.add(2);
    }

    private static void setupListOne() {
        inputList.add(10);
        inputList.add(7);
        inputList.add(12);
        inputList.add(2);
        inputList.add(4);
        inputList.add(7);
        inputList.add(2);
        inputList.add(4);
        inputList.add(1);
        inputList.add(2);
        inputList.add(6);
        inputList.add(6);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);
        inputList.add(4);
        inputList.add(7);
        inputList.add(2);
        inputList.add(7);
        inputList.add(3);
        inputList.add(1);
        inputList.add(3);
        inputList.add(11);
        inputList.add(4);
        inputList.add(2);
        inputList.add(1);
        inputList.add(5);
        inputList.add(2);
        inputList.add(3);
        inputList.add(3);
        inputList.add(3);
        inputList.add(6);
        inputList.add(1);
        inputList.add(3);
        inputList.add(9);
        inputList.add(5);
        inputList.add(2);
        inputList.add(1);
        inputList.add(2);
        inputList.add(11);
        inputList.add(9);
        inputList.add(2);
        inputList.add(3);
        inputList.add(8);
        inputList.add(2);
        inputList.add(5);
        inputList.add(1);
        inputList.add(2);
        inputList.add(7);
        inputList.add(2);
        inputList.add(4);
        inputList.add(11);
        inputList.add(2);
        inputList.add(12);
    }

}
