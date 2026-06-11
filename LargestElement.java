package com.javaarrayprograms;

import java.util.Scanner;

public class LargestElement {
	public static  int largestElement(int[] arr) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result=largestElement(arr);
		System.out.println(result);
	}

}
