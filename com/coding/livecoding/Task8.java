package com.coding.livecoding;
/*Write an application that implements a simple calculator.
The application should:
a. read first number (type float)
b. read one of following symbols: + - / *
c. read second number (type float)
d. return a result of given mathematical operation
If the user provides a symbol other than supported,
the application should print "Invalid symbol".
If  the  entered  action  cannot  be  implemented
(i.e.  it  is  inconsistent  with  the principles of mathematics),
the application should print "Cannot calculate".
*/
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        float input1 = scanner.nextFloat();
        float input2 = scanner.nextFloat();
        System.out.println("Enter operation:  + - / *: ");
        char operator = scanner.next().charAt(0);

        float output = 0;

        switch (operator){
            case '+':
                System.out.println("Result = " + (input1+input2));
                break;
            case '-':
                System.out.println("Result = " + (input1-input2));
                break;
            case '/':
                System.out.println("Result = " + (input1/input2));
                break;
            case '*':
                System.out.println("Result = " + (input1*input2));
                break;
            default:
                System.out.println("Invalid operator");
        }



//        if(operation.equals("+")){
//            output = input1 + input2;
//        }
//        if(operation.equals("-")){
//             output = input1 - input2;
//        }
//        if(operation.equals("/")){
//            output = input1 / input2;
//        }
//        if(operation.equals("*")){
//             output = input1 * input2;
//        }
//        if(!operation.equals("+") || !operation.equals("-") || !operation.equals("/")
//            || !operation.equals("*")){
//            System.out.println("Invalid symbol");
//        }
//        else{
//            System.out.println("Cannot calculate");
//        }
//        System.out.println("Anwser is: " + output);

    }
}
