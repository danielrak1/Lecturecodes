package com.coding.livecoding;

/*Write an application that reads a text from the user (type String)
and checks whether the user sneezed,
i.e. whether the text equals ‘achooo!’ with one or more letter "o" at the end of the expression
(so both 'acho!' and 'achooooooo!’ are correct).

Hint: use a regular expression with the appropriate quantifier.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        String input = getUserInput();
        checkIfUserSneezed(input);
    }

    private static void checkIfUserSneezed(String input) {
        Pattern pattern = Pattern.compile("acho", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        boolean sneeze = matcher.find();
        if(sneeze){
            System.out.println("You sneezed!");
        }else{
            System.out.println("You did not sneeze!");
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
