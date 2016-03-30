package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number1 = 0, number2 = 0, result = 0;
        Scanner scanner = new Scanner(System.in);
        String operation;
        System.out.println("Enter operation");
        operation = scanner.next();
        char c = operation.charAt(0);
        if (c == '+' || c == '-' || c == '/' || c == '*') {
            System.out.println("Enter first number: ");
            number1 = scanner.nextInt();
            System.out.println("Enter second number");
            number2 = scanner.nextInt();
            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;

            }
            System.out.println("Результат:" + result);
        } else {
            System.out.println("Error. You enter incorrect operation");
            System.exit(0);
        }


    }

}
