package com.company;

import java.util.Scanner;

public class OOP {
    static int number;
    static int result;

    public static void main(String[] args) {
        input();
        calc();
        print();
    }
    static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();
    }

    static int calc(int number) {
        int result = number * 2;
    }

    static void print(int number) {
        System.out.println("Answer: " + result);
    }
}


