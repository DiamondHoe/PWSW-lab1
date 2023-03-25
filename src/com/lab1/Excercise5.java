package com.lab1;

public class Excercise5 {
    public void Start(){
        Helpers helpers = new Helpers();

        System.out.println("Sprawdzanie czy liczba jest liczbą pierwszą.");
        int primaryNumber = helpers.GetInt("Wpisz liczbę aby sprawdzić czy jest liczbą pierwszą: ");

        if(primeCheck(primaryNumber)){
            System.out.println("Podana liczba jest liczbą pierwszą.");
        }
        else {
            System.out.println("Podana liczba nie jest liczbą pierwszą.");
        }
    }

    private boolean primeCheck(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
