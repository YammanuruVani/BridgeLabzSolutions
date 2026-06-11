package com.javaarrayprograms;

import java.util.Scanner;

public class smallestElement {
	public static  int smallestElement(int[] arr) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result=smallestElement(arr);
		System.out.println(result);


	}

}
