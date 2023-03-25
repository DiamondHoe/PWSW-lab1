package com.lab1;

import java.util.ArrayList;
import java.util.HashSet;

public class Excercise2 extends Helpers implements IExcercise{
    public void Start(){
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Sprawdzanie unikalnych wprowadzonych liczb.");
        int inputNumCount = GetInt("Podaj ile chcesz wprowadzić liczb:");
        int inputNumCounter = 0;

        while(inputNumCount >= inputNumCounter){
            numList.add(GetInt("Podaj liczbe:"));
            inputNumCounter = numList.size()+1;
        }

        HashSet<Integer> uniqueValues = new HashSet<>(numList);
        System.out.println("Podano " + uniqueValues.size() + " unikatowych liczb");
    }
}
