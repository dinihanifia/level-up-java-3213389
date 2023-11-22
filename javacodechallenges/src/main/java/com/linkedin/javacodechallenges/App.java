package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    public static boolean isEven(int n) {
        // use switch case
        // cannot be used when integer have negative in'em
        //int operation=n%2;
        //return switch(operation){
        //    case 0 -> true;
        //    case 1 -> false;
        //    default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        //};

        // linkedin solution
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userNum));

        scanner.close();
    }
}
