package com.javaarrayprograms;

import java.util.Scanner;

public class reverseElements {
	public static void reverseArrayElements(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		     Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
             reverseArrayElements(arr);

	}

}
