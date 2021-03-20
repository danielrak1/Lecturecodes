package com.coding.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(45, 122, 32);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] doubleArray = {num1, num2, num3};
        Arrays.sort(doubleArray);
        for(double number : doubleArray){
            System.out.println(number);
        }



    }
}
