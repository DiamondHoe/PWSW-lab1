package com.lab1;

import java.util.Scanner;

public class Helpers {
    public int GetInt(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);

        while (!sc.hasNextInt()) {
            System.out.println("Podaj poprawną liczbę:");
            sc.next();
        }
        return sc.nextInt();
    }
    public String GetBinaryValue(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);

        String binaryValue = sc.next();
        while (!binaryValue.matches("^[01]+$")) {
            System.out.println("Podaj poprawną liczbę:");
            binaryValue = sc.next();
        }
        return binaryValue;
    }
}
