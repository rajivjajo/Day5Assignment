package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.print("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.println("Distinct triplets that add up to 0 are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of distinct triplets: " + count);
    }
}

