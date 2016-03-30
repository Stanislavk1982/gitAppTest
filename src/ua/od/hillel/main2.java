package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 30.03.2016.
 */
public class main2 {
    public static void main(String[] args) {
        int number1 = 0, number2 = 0, result = 0;
        Scanner scanner = new Scanner(System.in);
        String operation;
        System.out.println("Enter operation");
        operation = scanner.next();
        char c = operation.charAt(0);
        if (function1() | function2() | function3() | function4()) {
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
    private static boolean function1() {
        System.out.println("in function 1");
        return c != '+';
    }
    private static boolean function2() {
        System.out.println("in function 2");
        return c != '-';
    }
    private static boolean function3() {
        System.out.println("in function 3");
        return c != '*';
    }
    private static boolean function4() {
        System.out.println("in function 4");
        return c != '/';
    }
}
