package com.example;

import java.util.Scanner;

public class Main {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Felaktig inmatning! Vänligen ange ett heltal mellan 0 och 1000.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ange startvärdet för intervallet (0-1000): ");
            int start = getUserInput();

            System.out.print("Ange slutvärdet för intervallet (0-1000): ");
            int end = getUserInput();

            if (calculator.isValidInterval(start, end)) {
                int primeCount = calculator.countPrimesInInterval(start, end);
                int primeSum = calculator.sumPrimesInInterval(start, end);
                calculator.printCount(primeCount);
                calculator.printSum(primeSum);
                break;
            } else {
                System.out.println("Hoppsan, fel intervall angivet! Försök igen.");
            }
        }

        scanner.close();
    }
}
