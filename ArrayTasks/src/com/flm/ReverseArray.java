package com.flm;

import java.util.Scanner;

public class ReverseArray {
	
	 static void reverseArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		for(int a:arr) {
			System.out.print(a+ " ");
		}
	 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr1 = new int[size];
		 for (int i = 0; i < size; i++) {
	            arr1[i] = sc.nextInt();
	        }
		ReverseArray.reverseArray(arr1);
				
	}

}
