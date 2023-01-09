package com.bridgelabz.day5assignment;

import java.util.Scanner;

public class PowerOftwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();
        int i = 0;
        int powerOfTwo = 1;
        while (i <= N) {
            System.out.println("2^" + i + " = " + powerOfTwo);
            powerOfTwo = powerOfTwo * 2;
            i++;
        }
    }
}
