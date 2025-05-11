package com.flm;

import java.util.Scanner;

public class LargerSmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr = new int[size];
		for(int i =0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		LargerSmallestNumber ls = new LargerSmallestNumber();
		
		ls.largesestAndSmallest(arr);
		
		sc.close();
		
	}
	void largesestAndSmallest(int[] arr) {
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
			else {
				smallest=arr[i];
			}
		}
		System.out.println("Largest is : "+largest);
		System.out.println("Smallest is : "+smallest);
	}

}
