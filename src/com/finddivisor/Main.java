package com.finddivisor;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        number1 = Math.abs(number1);
        number2 = Math.abs(number2);

        if (number1 == 0 || number2 == 0)
            System.out.println("No greatest common factor");

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        System.out.println("Greatest common factor: " + number1);
    }
}
