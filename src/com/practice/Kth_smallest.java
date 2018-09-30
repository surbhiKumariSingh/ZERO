package com.practice;

import java.util.Arrays;

public class Kth_smallest {

	public static void main(String[] args) {
		int a[]= {2,3,1,4,5,9};
	int	k=4;
		System.out.println(kelement(a, k));

	}

	static int kelement(int a[], int k) {
		Arrays.sort(a);
		return a[k-1];
		
	}

}
