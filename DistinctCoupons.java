package com.logicalprograms;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class DistinctCoupons {
	public static int getRandomCoupon(int n) {
		  Random random = new Random();
		  return random.nextInt();
	}
	public static int generateCoupons(int n){
		     int count=0;
		     HashSet<Integer> coupons = new HashSet<Integer>();
		     while(coupons.size()<n) {
		    	 int coupon=getRandomCoupon(n);
		    	 coupons.add(coupon);
		    	 count++;
		     }
		     System.out.println("Distnict coupons: "+coupons);
		     
		    return count; 
	}

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter a Number");
		        int n=scan.nextInt();
		        int result=generateCoupons(n);
		        System.out.println(result);

	}

}
