package com.bridgelabz.day5assignment;

import java.util.Scanner;

public class LargestNum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};
        int largest = num1;
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}