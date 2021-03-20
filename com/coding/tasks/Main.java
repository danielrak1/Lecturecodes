package com.coding.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ann integer");
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        System.out.println(sumDigits(input));

    }

    public static int sumDigits(long n){
        // n = 1234
        // 4 -> 1234 % 10
        // 3 -> n / 10 -> 123 -> 123 % 10
        int sum =0;
        while (n!=0){
           sum += n % 10;
           n = n / 10;
        }
        return sum;
    }
}
