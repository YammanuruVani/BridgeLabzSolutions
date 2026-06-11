package com.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
	static int count=0;
	static int[] notes= {1000,500,100,50,10,5,2,1};
	public static void findNotes(int amount){
		if(amount==0) {
			return;
		}
		for(int note :notes) {
			if(amount>=note) {
				System.out.println(note);
				count++;
				findNotes(amount-note);
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		int amount=scan.nextInt();
		findNotes(amount);
		System.out.println("Minimum notes are required: "+count);
	}

}
