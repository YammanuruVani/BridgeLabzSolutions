package com.javaarrayprograms;

import java.util.Scanner;

public class SecondLargestElement {
	public static int printSecondLargest(int[] arr){
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
		}
		return max2;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int result=   printSecondLargest(arr);
		System.out.println(result);

	}

}
