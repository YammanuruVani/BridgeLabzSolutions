package com.baicsofjava;

public class StaticInformation {
	static int a,b;
	static {
		a=20;
		b=40;
		System.out.println("This block is used to initialise static variables");
	}
	static void display() {
		System.out.println("Statcic  method executed");
	}


	public static void main(String[] args) {
		System.out.println("Main method executed");
		display();

	}

}
