package com.javaarrayprograms;

import java.util.Scanner;

public class OddPositionElements {
	public static void oddPositionElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2 !=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		oddPositionElement(arr);
	}

}
