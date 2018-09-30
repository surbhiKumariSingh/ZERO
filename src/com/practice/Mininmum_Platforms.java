package com.practice;

import java.util.Arrays;

public class Mininmum_Platforms {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = arr.length;
		System.out.println("sadsdasdad="+GFG(arr, dep, n));

	}

	static int GFG(int arr[], int dep[], int n) {
		int i = 1, j = 0;
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		Arrays.sort(dep);
		
		int platfrom_needed = 1, result = 1;

		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				platfrom_needed++;
				i++;
			} else if (platfrom_needed > result) {
				result = platfrom_needed;

			} else {
				platfrom_needed--;
				j++;
			}
		}
		return result;

	}

}
