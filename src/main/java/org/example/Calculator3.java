package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

//Ask for Monthly Payout Amount, AnnualInterest Rate, and Number of Years
        System.out.println("What is your Monthly Payout Amount?");

        double monthlyPayoutAmount = scanner.nextDouble();

        System.out.println("What is your Monthly Interest Rate?");

        double annualInterestRate = scanner.nextDouble();

        System.out.println("How many years?");

        int numberOfYears = scanner.nextInt();

        //Calculate monthly interest rate and number of monthly payments

        double monthlyInterestPayment =  (annualInterestRate /12) / 100;

        int numberOfMonthlyPayments = numberOfYears *12;

        //PV = PMT × [(1 - (1 + r)^(-n)) / r]

        double presentValue = monthlyPayoutAmount *
                ((1 - Math.pow( 1 + monthlyInterestPayment,-numberOfMonthlyPayments)) /monthlyInterestPayment);

        System.out.println("You'll need to invest " + presentValue + " today");

    }
}
