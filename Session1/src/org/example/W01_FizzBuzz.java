package org.example;

public class W01_FizzBuzz {
    public static void showFizzBuzz(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        showFizzBuzz(100);
    }
}
