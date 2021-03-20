package com.coding.livecoding;
//

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a, b ,c:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2)-(4*a*c);
        if(delta<0){
            System.out.println("Delta is negative: " + delta);
            return;
        }
        double x1 = (-b-Math.sqrt(delta))/(2*a);
        double x2 = (-b+Math.sqrt(delta))/(2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("Delta = " + delta);



    }
}
