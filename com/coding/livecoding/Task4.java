package com.coding.livecoding;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            if(i%3==0) {
                System.out.println("Fizz");
            }else if(i%7==0){
                System.out.println("Buzz");
            }else if(i%3==0 && i%7==0){
                System.out.println("Fizz buzz");
            }else{
                System.out.println(i);
            }

        }

    }
}