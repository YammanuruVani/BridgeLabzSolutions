package com.javaarrayprograms;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElements {
	public static void printDuplicates(int[] arr) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int x:set) {
			System.out.print(x+" ");
		}

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		printDuplicates(arr);

	}

}
