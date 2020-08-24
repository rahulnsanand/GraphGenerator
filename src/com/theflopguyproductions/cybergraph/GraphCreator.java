package com.theflopguyproductions.cybergraph;

import java.util.ArrayList;

/**
 *
 * This class helps generate the required graph in console of any Java IDE
 * Developed by: Rahul Anand
 * 25/08/2020
 *
 * Usage Instructions :
 * 1) Initialise the class with the updated ArrayList<Integer>
 * 2) Call the function computeGraph();
 *
 * Debugging info :
 * 1) Make sure the list data is valid.
 * 2) The first element of the list should always be greater than the second element.
 * 3) Make sure the object of this class is initialised after the ArrayList<Integer> is initialised.
 *
 */

public class GraphCreator {

    private final ArrayList<Integer> inputList;
    private int[][] dimenArray;
    private boolean isPlus = true, currentPlusMinus = true;
    private int yMaxValue = 0, totalPlusMinusValue = 0, xValue = 0;

    /**
     * Constructor that should receive a valid input integer list as argument
     */
    public GraphCreator(ArrayList<Integer> inputList) {
        this.inputList = inputList;
        setupMaxTotal();
    }

    private void setupMaxTotal() {
        isPlus = true;
        for (Integer integer : inputList) {
            xValue += integer;
            if (isPlus) {
                totalPlusMinusValue += integer;
                isPlus = false;
            } else {
                totalPlusMinusValue -= integer;
                isPlus = true;
            }
            if(yMaxValue<totalPlusMinusValue){
                yMaxValue = totalPlusMinusValue;
            }
        }
        yMaxValue += 4;
        xValue += 1;
    }

    /**
     * A public function that manages the order of data execution
     */
    public void computeGraph(){
        generateBaseMatrix();
        try {
            populateMatrix();
            displayMatrix();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The input list seems to incorrect.\nKindly verify and try again.");
        }

    }

    /**
     * A loop with time complexity of n^2 for displaying the data in graph format
     */
    private void displayMatrix() {

        isPlus = true;

        for(int i = 0; i <yMaxValue; i++){
            for(int j = 0; j < xValue; j++){
                if(dimenArray[j][i]==1){
                    System.out.print("/");
                } else if (dimenArray[j][i]==-1){
                    System.out.print("\\");
                }  else if (dimenArray[j][i]==5){
                    System.out.print("|");
                } else if (dimenArray[j][i]==4){
                    System.out.print("<");
                } else if (dimenArray[j][i]==6){
                    System.out.print(">");
                } else if (dimenArray[j][i]==7){
                    System.out.print("/");
                } else if (dimenArray[j][i]==9){
                    System.out.print("\\");
                } else if (dimenArray[j][i]==8){
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * Assigning the generated maximum x and y value to the 2D Matrix Array
     */
    private void generateBaseMatrix(){
        dimenArray = new int[xValue][yMaxValue];
    }

    /**
     * A function with time complexity of n^2 for populating the 2D Matrix Array with suitable values
     */
    private void populateMatrix(){

        int initX = 0, initY = yMaxValue-1;
        isPlus = true;
        currentPlusMinus = true;

        int  currentTotal = 0;

        for (int currentValue : inputList) {

            currentTotal = computeCurrentTotal(currentTotal, currentValue);

            while (currentValue > 0) {
                if (currentValue > 1) {
                    if (isPlus) {
                        setForwardSlash(initX, initY);
                        initY--;
                    } else {
                        setBackwardSlash(initX, initY);
                        initY++;
                    }
                    initX++;
                }
                if (currentValue == 1) {
                    if (currentTotal == yMaxValue - 4) {
                        setHuman(initX, initY);
                        initX += 2;
                    } else {
                        if (isPlus) {
                            setForwardSlash(initX, initY);
                        } else {
                            setBackwardSlash(initX, initY);
                        }
                        initX++;
                    }
                }
                currentValue--;
            }
            toggleIsPlus();
        }
    }

    /**
     * Updating the current total to keep a check on the position of the max value
     */
    private int computeCurrentTotal(int currentTotal, int currentValue) {
        if (currentPlusMinus) {
            currentTotal += currentValue;
            currentPlusMinus = false;
        } else {
            currentTotal -= currentValue;
            currentPlusMinus = true;
        }
        return currentTotal;
    }

    /**
     * Setting forward slash
     */
    private void setForwardSlash(int initX, int initY){
        dimenArray[initX][initY] = 1;
    }

    /**
     * Setting backward slash
     */
    private void setBackwardSlash(int initX, int initY){
        dimenArray[initX][initY] = -1;
    }

    /**
     * Setting human figurine
     */
    private void setHuman(int initX, int initY){
        dimenArray[initX][initY-2] = 7;
        dimenArray[initX+1][initY-2] = 5;
        dimenArray[initX+2][initY-2] = 9;
        dimenArray[initX+1][initY-3] = 8;
        dimenArray[initX][initY-1] = 4;
        dimenArray[initX+2][initY-1] = 6;
        dimenArray[initX][initY] = 1;
    }

    private void toggleIsPlus() {
        isPlus = !isPlus;
    }

}
