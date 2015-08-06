package com.salesTax;

import java.util.Scanner;

public class InputOutput {
    Scanner scanner = new Scanner(System.in);
    public String getStringInput() {
        String input = scanner.nextLine();
        return input;
    }

    public void display(String message) {
        System.out.println(message);
    }
}
