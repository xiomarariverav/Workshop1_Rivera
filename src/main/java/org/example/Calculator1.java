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

        double monthlyRate = annualRate/ (100*12);

        int numberOfMonthlyPayments = loanTerm * 12;

        double numerator = monthlyRate * Math.pow(1 + monthlyRate,numberOfMonthlyPayments);










    }
}
