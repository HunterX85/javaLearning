package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second num: ");
        int num2 = scan.nextInt();


        System.out.println("Res 1: " + (num1 + num2));
        System.out.println("Res 1: " + (num1 - num2));
        System.out.println("Res 1: " + (num1 * num2));
        System.out.println("Res 1: " + (num1 / num2));
        System.out.println("Res 1: " + (num1 % num2));
    }
}