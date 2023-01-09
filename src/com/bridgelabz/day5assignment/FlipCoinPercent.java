package com.bridgelabz.day5assignment;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of time you want to flip coins : ");
            int numFlips = scanner.nextInt();
            int heads = 0;
            int tails = 0;
            Random r = new Random();
            for (int i = 0; i < numFlips; i++) {
                if (r.nextDouble() < 0.5) {
                    heads++;
                } else {
                    tails++;
                }
            }
            double headPercentage = (double) heads / numFlips * 100;
            double tailPercentage = (double) tails / numFlips * 100;
            System.out.println("Heads-Percentage is : " + headPercentage + " %, Tails_Percentage is : " + tailPercentage + " %");
        }
    }



