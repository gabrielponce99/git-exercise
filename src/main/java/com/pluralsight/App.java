package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String input = scanner.nextLine();

        System.out.println("Hello " + input + "!");

    }
}
