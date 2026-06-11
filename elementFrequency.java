package com.javaarrayprograms;

import java.util.*;
import java.util.Map.Entry;


public class elementFrequency {
	public static void elementFreq(int[] arr) {
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		Set<Entry<Integer,Integer>> e=map.entrySet();
		for(Entry<Integer,Integer>x:e) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		elementFreq(arr);

	}

}
