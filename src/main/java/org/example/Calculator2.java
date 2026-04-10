package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for initial deposit, Annual Interest Rate, and Number of years

        System.out.println("What was your initial deposit?");

        double initialDeposit = scanner.nextDouble();

        System.out.println("What is your Annual Interest Rate?");

        double annualInterestRate = scanner.nextDouble();

        System.out.println("How many years?");

        int numberOfYears = scanner.nextInt();

        // Calculate daily rate
        // annual interest rate/365
        double dailyInterestRate = (annualInterestRate / 100)/ 365;

        //FV = P × (1 + (r / n))^(n × t)

        double futureValue = initialDeposit *
                Math.pow(1 + dailyInterestRate , (365 * numberOfYears));

        // Total Interest Earned = FV - P

        double totalInterestEarned = futureValue - initialDeposit;

        System.out.println("Your future value will be " + futureValue + " where you earned "
                + totalInterestEarned +" in total interest!");







    }
}
