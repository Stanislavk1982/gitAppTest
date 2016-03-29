package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int chislo1, chislo2, result = 0;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите операцию");
        operation = scanner.next();
        char c = operation.charAt(0);
        if (c == '+' | c == '-' | c == '/' | c == '*') {
            //System.out.println("1");
        } else {
            //System.out.println("22");
            int i;
            for (i = 100; i > 10; i++) {
                System.out.println("Enter correct operation");
                operation = scanner.next();
                c = operation.charAt(0);
                if (c == '+' | c == '-'| c == '/' | c == '*') i = 1;

            }
        }


        System.out.println("Введите первое число число: ");
        chislo1 = scanner.nextInt();
        System.out.println("Введите второе число");
        chislo2 = scanner.nextInt();
        switch (operation) {
            case "+":
                result = chislo1 + chislo2;
                break;
            case "-":
                result = chislo1 - chislo2;
                break;
            case "*":
                result = chislo1 * chislo2;
                break;
            case "/":
                result = chislo1 / chislo2;
                break;

        }
        System.out.println("Результат:" + result);


    }

}
