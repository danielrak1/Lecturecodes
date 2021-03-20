package com.coding.tasks;

public class Task4 {
    public static void main(String[] args) {
        int primeCount = 0;
        for(int i = 2; i < 10_000; i++){
            if(isPrime(i)){
                primeCount++;
            }
        }
        System.out.println("There are " + primeCount +
                " prime numbers "+ "less than 10000");
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
