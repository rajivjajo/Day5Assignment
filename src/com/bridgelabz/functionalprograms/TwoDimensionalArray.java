package com.bridgelabz.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out));
            System.out.print("Enter the number of rows: ");
            int m = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int n = scanner.nextInt();

            Object[][] array = new Object[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = i+j;
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.print(array[i][j] + " ");
                }
                printWriter.println();
            }
        printWriter.flush();
        }
    }

