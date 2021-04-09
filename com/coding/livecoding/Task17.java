package com.coding.livecoding;

/*Write an application that will read from the user the date of
your next SDA classes and calculate how many days are left to them.
Hint: read the date as String and parse it to LocalDate.
Get the current date using LocalDate.now() method.
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        String input = getInput();
        printDifferenceInDays(input);
    }

    private static void printDifferenceInDays(String input) {
        LocalDate classDate = LocalDate.parse(input);
        LocalDate dateToday = LocalDate.now();
        Period difference = Period.between(classDate, dateToday);
        System.out.println("The difference is " + difference.getDays() + " days");
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date of the next class yyyy-mm-dd: ");
        String input = scanner.next();
        return input;
    }
}
