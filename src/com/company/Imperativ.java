package com.company;

import java.util.Scanner;

public class Imperativ {

    public static void main(String[] args) {
	   //Императивное
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int doubleNum = number*2;

        System.out.println("Answer: " + doubleNum);
    }
}
