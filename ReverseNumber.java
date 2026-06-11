package com.logicalprograms;
import java.util.Scanner;
public class ReverseNumber {
	public static void reverseNumber(int Number){
		int reverseNum=0;
		while(Number != 0) {
			int digit=Number %10;
			reverseNum =reverseNum*10+digit;
			Number /=10;
		}
		System.out.println(reverseNum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Number=scan.nextInt();
		reverseNumber(Number);

	}

}
