package ClassWork;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        do {
            System.out.println("Please imput a");
            int a = scanner.nextInt();
            System.out.println("Please imput b");
            int b = scanner.nextInt();
            System.out.println("Imput +, -, *, /");
            String c = scanner.next();
            switch (c) {
                case "+":
                    System.out.println(calc.gumarum(a, b));
                    break;
                case "-":
                    System.out.println(calc.hanum(a, b));
                    break;
                case "*":
                    System.out.println(calc.bazmapatkum(a, b));
                    break;
                case "/":
                    System.out.println(calc.bajanum(a, b));
                    break;
                default:
                    System.out.println("invalid operator");

            }

        }while (true);
    }
}