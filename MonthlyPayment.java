
//package com.logicalprograms;

public class MonthlyPayment {

    public static double monthlyPayment(double P, double Y, double R) {

        double n = 12 * Y;
        double r = R / (12 * 100);

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        return payment;
    }

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java MonthlyPayment <P> <Y> <R>");
            return;
        }

        double P = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        double R = Double.parseDouble(args[2]);

        double payment = monthlyPayment(P, Y, R);

        System.out.printf("Monthly Payment = %.2f%n", payment);
    }
}