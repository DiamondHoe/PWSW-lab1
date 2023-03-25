package com.lab1;

public class Excercise3 extends Helpers implements IExcercise{
    public void Start(){
        String binaryInput = GetBinaryValue("Podaj liczbę binarna: ");
        System.out.println(CountHoles(binaryInput));
    }

    private int CountHoles(String num) {
        int holesCount = 0;
        char[] numCharArr = num.toCharArray();

        int iterator = 0;

        int currentNum;
        int previousNum = 1;

        boolean sequenceStarted = false;
        boolean sequenceFinished = true;

        while (num.length()-1 >= iterator){
            currentNum = Character.getNumericValue(numCharArr[iterator]);

            if(iterator != 0){
                previousNum = Character.getNumericValue(numCharArr[iterator-1]);
            }

            if((currentNum == 0 && previousNum == 0 && sequenceFinished && !sequenceStarted) || (currentNum == 0 && iterator == 0)){
                sequenceStarted = true;
                sequenceFinished = false;
                holesCount++;
            }

            if((currentNum == 1 && previousNum == 0) || (currentNum == 1 && previousNum == 1)){
                sequenceFinished = true;
                sequenceStarted = false;
            }

             iterator++;
        }

        return holesCount;
    }
}
