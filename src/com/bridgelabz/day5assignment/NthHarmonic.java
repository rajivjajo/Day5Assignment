package com.bridgelabz.day5assignment;

import java.util.Scanner;

public class NthHarmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Harmonic Value N : ");
        int N = scanner.nextInt();
        double result = 0.0;
        for (int i = 1; i <= N; i++) {
            result += 1.0 / i;
        }
        System.out.println(result);
    }
}
