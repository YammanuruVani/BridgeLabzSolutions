package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static String checkPrime(int Number) {
		if(Number<=1) return Number+" is not a Prime Number";
		for(int i=2;i*i<=Number;i++) {
			if(Number%i==0) return Number+" is not a Prime Number";
			
		}
		return Number+" is a Prime Number";
		
	}

	public static void main(String[] args) {
		      Scanner scan = new Scanner(System.in);
		      System.out.println("Enter the Number");
		      int Number=scan.nextInt();
		     String result= checkPrime(Number);
		     System.out.println(result);

	}

}
