package com.coding.livecoding;

//Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
// Your application should read two variables:
// weight (in kilograms, type float) and height (in centimeters, type int).
// BMI should be calculated given following formula:
// The  optimal  BMI  range  is  from  18.5  to  24.9,
// smaller  or  larger  values  are  non-optimal values.
// Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Insert weight in 'kg': ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();

        System.out.println("Insert height in 'cm' :");
        int height = scanner.nextInt();
        System.out.println("Weight: " + weight + " Height: " + height);

//implementing the formula, we need to divide 'height' by 100 to convert the value to meters.
        double bmi = weight/(Math.pow(height, 2)/100);

       if(bmi<=24.9 && bmi >= 18.5){
           System.out.println("BMI is optimal: " + bmi);
       }else{
           System.out.println("BMI is not optimal: " + bmi);
       }



    }
}
