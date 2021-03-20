package com.coding.livecoding;
//Write an application that gets one positive number
// (type int) from the user and calculates a sum of digits
// of the given number. Hint: to make some operations on
// every single digit of the number (digit by digit),
// you can calculate the remainder of dividing the number
// by 10 (to get the value of the last digit) and divide
// the number by 10 (to "move" to the next digit).

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            sum = sum + (i % 10);
        }
        System.out.println(sum);
    }
}
