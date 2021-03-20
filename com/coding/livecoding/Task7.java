package com.coding.livecoding;

//Write  an  application  that  will  take  a  positive  number  from
// the  user  (type int)  and calculate the Fibonacci number at the
// indicated index. For example, if the number equals 5, your program
// should print the fifth Fibonacci number. In Fibonacci sequence,
// each number  is  the  sum  of  the  two  preceding  ones.
// For  example,  the  first  few  Fibonacci numbers are:

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibonacci(input));
    }

    static int fibonacci(int n) {

        int fibo[] = new int[n + 2];
        int i;

        fibo[0]=0;
        fibo[1]=1;
        for(i=2; i <=n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }
}
