package com.coding.livecoding;

//Write an application that takes a number n from the user
// (type int) and calculates the sum of the harmonic series
// from 1 to n, according to the formula below:

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double sum=0;



        for (double i =1; i<=input; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Output of Harmonic series is: " + sum);
    }

}
