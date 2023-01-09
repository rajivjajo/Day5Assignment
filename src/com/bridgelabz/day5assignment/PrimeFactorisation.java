package com.bridgelabz.day5assignment;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find its prime factors : ");
        int N = scanner.nextInt();
        int i = 2;
        while (i * i <= N) {
            if (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            } else {
                i++;
            }
        }
        if (N > 1) {
            System.out.print(N);
        }
    }
}
