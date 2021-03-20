package com.coding.livecoding;

//Write  an  application  that  will  read  diameter  of  a  circle  (variable  of  type float)
// and calculate perimeter of given circle. Firstly, assume π = 3.14.
// Later, use value of π from built-in Math class

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter diameter: ");
        Scanner scanner = new Scanner(System.in);


            float diameter = scanner.nextFloat();
            float perimeter = diameter * (float) Math.PI;
            System.out.println("Perimeter is: " + perimeter);


    }
}
