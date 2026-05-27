package com.baicsofjava;
import java.util.Scanner;

public class CheckStringEquality {
	public static boolean isEqual(String s1,String s2){
		if(s1.equals(s2)){
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		boolean res=isEqual(s1,s2);
		System.out.println(res);

	}

}
