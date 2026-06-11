package com.logicalprograms;

import java.util.Scanner;

public class ToBinary {

    public static String toBinary(int n) {

        StringBuilder binary = new StringBuilder();

        for (int i = 31; i >= 0; i--) {

            int power = 1 << i;

            if ((n & power) != 0) {
                binary.append("1");
            } else {
                binary.append("0");
            }
        }

        return binary.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        System.out.println("32-bit Binary Representation:");
        System.out.println(toBinary(n));

        sc.close();
    }
}
