package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("The roots of the equation are: ");
        System.out.println("x1 = " + root1);
        System.out.println("x2 = " + root2);
    }
}
