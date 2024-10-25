package com.example;

public class Calculator {

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimesInInterval(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumPrimesInInterval(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isValidInterval(int start, int end) {
        return start >= 0 && end <= 1000 && start <= end;
    }

    public void printCount(int count) {
        System.out.println("Hej, det finns " + count + " primtal mellan 0 och 1000!");
    }

    public void printSum(int sum) {
        System.out.println("Och den totala summan av dessa primtal är " + sum + ".");
    }
}

