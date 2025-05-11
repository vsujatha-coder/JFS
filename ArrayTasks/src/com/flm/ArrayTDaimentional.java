package com.flm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTDaimentional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of array : ");
		int row = sc.nextInt();
		System.out.println("Enter number of columns of array : ");
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter row "+i+"& col "+j+" element value : ");
				int val = sc.nextInt();
				arr[i][j]=val;
			}
		}
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}

}
