package com.lab1;

import java.util.Random;

public class Excercise1 extends Helpers implements IExcercise{
    public void Start(){
        System.out.println("Witaj w zgadywaniu liczby!");
        System.out.println("Podaj zakres w jakim chcesz zgadywać: ");

        int boundariesNum = GetInt("Wprowadź liczbę całowitą");

        Random random = new Random();
        int randNum = random.nextInt(boundariesNum);

        boolean guessed = false;
        int guessNum;

        while(!guessed){
            guessNum = GetInt("Wprowadź liczbę całowitą");
            guessed = CheckGuessNum(guessNum, randNum);
        }
    }

    private boolean CheckGuessNum(int inputNum, int randNum){
        boolean guessed = false;

        if(inputNum == randNum){
            System.out.println("Zgadłeś liczbę!");
            guessed = true;
        }
        else if(inputNum > randNum){
            System.out.println("Wylosowana liczba jest mniejsza od podanej.");
        }
        else if(inputNum < randNum){
            System.out.println("Wylosowana liczba jest większa od podanej.");
        }
        return guessed;
    }
}
