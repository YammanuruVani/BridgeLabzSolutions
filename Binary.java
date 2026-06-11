package com.logicalprograms;

import java.util.Scanner;

public class Binary {

    public static int swapNibbles(int n) {
        return ((n & 0x0F) << 4) | ((n & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static String toBinary(int n) {
        String binary = "";

        for (int i = 7; i >= 0; i--) {
            binary += ((n >> i) & 1);
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-255): ");
        int num = sc.nextInt();

        System.out.println("Original Binary : " + toBinary(num));

        int swapped = swapNibbles(num);

        System.out.println("After Swapping Nibbles : " + toBinary(swapped));
        System.out.println("Decimal Value : " + swapped);

        if (isPowerOfTwo(swapped)) {
            System.out.println(swapped + " is a Power of 2");
        } else {
            System.out.println(swapped + " is NOT a Power of 2");
        }

        sc.close();
    }
}
