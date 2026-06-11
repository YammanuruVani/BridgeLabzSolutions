package com.logicalprograms;

import java.util.Scanner;

public class Elapsedtime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		System.out.println("Press Enter to start: ");
		long startTime =System.currentTimeMillis();
		System.out.println("Press Enter to End: ");
		scan.nextLine();
		long endTime =System.currentTimeMillis();
		System.out.println("Elapsed Time= "+(endTime-startTime));

	}

}
