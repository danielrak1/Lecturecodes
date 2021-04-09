package com.coding.livecoding;

import java.util.Random;
import java.util.Scanner;

/*Write an application that will play "too much, too little" game with you.
At the beginning the  application  should  randomly  choose  a  number  from
  0  to  100  (hint:  use  the Random.nextInt() method) and wait for the
  user to enter a number. If the user gives a number greater than the
  number chosen by the computer, your application should print "too  much"
  and  wait  for  the  next  number.  If  the  user  gives  a  smaller
  number,  the application should print "not enough" and wait for the
  next number in the same way. If the  user  provides  the  exact  value,
  the  application  should  print  the  word "Congratulations!"
  and finish.
 */
public class Task20 {
    public static void main(String[] args) {

        int randomNumber = generateRandomNumber();
        findRandomNumber(randomNumber);

    }

    private static int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
//        System.out.println(randomNumber);
        return randomNumber;
    }

    private static int getInput() {
        System.out.println("Enter a number between 0 and 100:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    private static void findRandomNumber(int randomNumber) {
        while (true) {
            int input = getInput();
            if (input == randomNumber) {
                System.out.println("Congrats!");
                break;
            } else if (randomNumber > input) {
                System.out.println("not enough, guess again");
            } else {
                System.out.println("too much, guess again");
            }
        }
    }
}
