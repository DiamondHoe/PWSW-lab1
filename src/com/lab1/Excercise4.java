package com.lab1;

import java.util.ArrayList;
import java.util.HashSet;

public class Excercise4 extends Helpers implements IExcercise{
    public void Start(){
        ArrayList<Integer> firstSet = new ArrayList<>();
        ArrayList<Integer> secondSet = new ArrayList<>();

        System.out.println("Program operujący na zbiorach");
        int firstSetSize = GetInt("Podaj rozmiar pierwszego zbioru:");
        int secondSetSize = GetInt("Podaj rozmiar drugiego zbioru:");

        System.out.println("Dodaj liczby do zbioru pierwszego: ");
        while(firstSet.size() <= firstSetSize-1){
            firstSet.add(GetInt("Podaj liczbę którą dodasz do zbioru:"));
        }

        System.out.println("Dodaj liczby do zbioru drugiego: ");
        while(secondSet.size() <= secondSetSize-1){
            secondSet.add(GetInt("Podaj liczbę którą dodasz do zbioru:"));
        }

        System.out.println("Suma zbior to: " + SumOfSets(firstSet, secondSet));

        System.out.println("Różnica zbiorów A/B to: " + DiffOfSets(firstSet, secondSet));

        System.out.println("Część wspólna zbiorów to: " + CommonOfSets(firstSet, secondSet));

        System.out.println("Różnica symetryczna zbiorów to:" + SymmetricSetDifference(firstSet, secondSet));
    }

    private HashSet<Integer> SumOfSets(ArrayList<Integer> firstSet, ArrayList<Integer> secondSet){
        ArrayList<Integer> linkedSet = new ArrayList<>();
        linkedSet.addAll(firstSet);
        linkedSet.addAll(secondSet);
        return new HashSet<>(linkedSet);
    }

    private ArrayList<Integer> DiffOfSets(ArrayList<Integer> firstSet, ArrayList<Integer> secondSet){
        firstSet.removeAll(secondSet);
        return firstSet;
    }

    private ArrayList<Integer> CommonOfSets(ArrayList<Integer> firstSet, ArrayList<Integer> secondSet){
        firstSet.retainAll(secondSet);
        return firstSet;
    }

    private HashSet<Integer> SymmetricSetDifference(ArrayList<Integer> firstSet, ArrayList<Integer> secondSet){
        HashSet<Integer> newSet = new HashSet<>(firstSet);
        secondSet.forEach(newSet::remove);
        secondSet.removeAll(firstSet);
        newSet.addAll(secondSet);
        return newSet;
    }
}
