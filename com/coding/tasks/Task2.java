package com.coding.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input + " is palindrome: "+ isPalindorme(input));

    }

    public static int reverse (int number){

        StringBuilder stringBuilder = new StringBuilder(number + "");
        stringBuilder = stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());


    }

    public static boolean isPalindorme (int number){
        int reversedNumber = reverse(number);
        return reversedNumber == number;

    }

}


