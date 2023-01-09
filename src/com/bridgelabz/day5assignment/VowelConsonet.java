package com.bridgelabz.day5assignment;

import java.util.Scanner;
public class VowelConsonet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a'|| ch == 'A' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U'  || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}