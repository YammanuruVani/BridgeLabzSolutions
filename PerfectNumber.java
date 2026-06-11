package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static String perfectNumber(int N) {
		int sum=0;
		for(int i=1;i<N;i++) {
			if(N%i==0) {
				sum +=i;
			}
		}
		return (sum==N)?"Perfect Number":"Not a Perfect Number";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter a Number");
		int N=scan.nextInt();
		String result= perfectNumber(N);
		System.out.println(result);

	}

}
