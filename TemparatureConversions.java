package com.logicalprograms;

import java.util.Scanner;

public class TemparatureConversions {
	public static void temparatureConversion(float temperature) {
		float farenheit=temperature*(9.0f/5)+32;
		System.out.println(farenheit);
		float celsius=(farenheit-32)*5/9;
		System.out.println(celsius);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float temperature=scan.nextFloat();
		temparatureConversion(temperature);
	}

}
