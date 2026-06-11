package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacciSeries(int N) {
		int firstTerm=0,secondTerm=1;
		System.out.println("The Fibonacci Series: ");
		for(int i=1;i<=N;i++) {
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		fibonacciSeries(N);
	}

}
