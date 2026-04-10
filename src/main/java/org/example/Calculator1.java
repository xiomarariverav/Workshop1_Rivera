package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for principal, interest rate, and loan length

        System.out.println("What is your Principal?");

        long principal = scanner.nextLong();

        System.out.println("What is your Annual Rate?");

        double annualRate = scanner.nextDouble();

        System.out.println("What is your Loan Term in Years?");

        int loanTerm = scanner.nextInt();

        // Find Monthly Rate and Number of Monthly Payments

        double monthlyRate = annualRate/ (100*12);

        int numberOfMonthlyPayments = loanTerm * 12;

        // M = P × (i * (1 + i)^n / ( (1 + i)^n ) - 1)

        double numerator = monthlyRate * Math.pow(1 + monthlyRate,numberOfMonthlyPayments);
        double denominator = Math.pow(1 + monthlyRate,numberOfMonthlyPayments) -1;

        double monthlyPayment = principal * (numerator / denominator);

        //Total Interest = (M×n)−P

        double totalInterestPayment = ((monthlyPayment * numberOfMonthlyPayments) - principal);

        System.out.println(" Your monthly payment is " + monthlyPayment + ". You total interest payment will be " + totalInterestPayment + "."
                );














    }
}
