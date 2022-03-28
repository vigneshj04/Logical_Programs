package com.logical.programs;

import static com.logical.programs.LogicalPrograms.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Fibonacci Series");
        System.out.println("2.Prime Number");
        System.out.println("Enter the choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                fibonacciSeries();
            case 2:
                primeNumber();
        }

    }
}


