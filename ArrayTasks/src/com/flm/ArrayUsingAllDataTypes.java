package com.flm;

import java.util.Scanner;

public class ArrayUsingAllDataTypes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// obj for class
		ArrayUsingAllDataTypes ad = new ArrayUsingAllDataTypes();

		// byte array size
		System.out.println("Enter size of byte array:");
        int size = sc.nextInt();
        
        
        ad.byte_Array(size, sc);
		 

		// short array size
		System.out.println("Enter size of short Array : ");
		int short_Size = sc.nextInt();

		ad.shortArray(short_Size,sc);

		// int array size
		System.out.println("Enter size of integer Array : ");
		int int_Size = sc.nextInt();

		ad.intArray(int_Size,sc);

		// long array size
		System.out.println("Enter size of long Array : ");
		int long_Size = sc.nextInt();

		ad.longArray(long_Size,sc);

		// float array size
		System.out.println("Enter size of float Array : ");
		int float_Size = sc.nextInt();

		ad.floatArray(float_Size,sc);

		// double array size
		System.out.println("Enter size of double Array : ");
		int double_Size = sc.nextInt();

		ad.doubleArray(double_Size,sc);
		
		// char array size
		System.out.println("Enter size of char Array : ");
		int char_Arr_Size = sc.nextInt();
		sc.nextLine();

		ad.charArray(char_Arr_Size,sc);
		
		// string array size
		System.out.println("Enter size of string Array : ");
		int string_Arr_Size = sc.nextInt();
		sc.nextLine();

		ad.string_Array(string_Arr_Size,sc);

	}

	// Byte DataType
	
	void byte_Array(int byte_Size, Scanner sc) {
        byte[] byte_Array = new byte[byte_Size];

        for (int i = 0; i < byte_Size; i++) {
            System.out.println("Enter byte value (" + (i + 1) + "):");
            byte_Array[i] = sc.nextByte(); 
        }
        for (int i = 0; i < byte_Size; i++) {
            System.out.println((i + 1) + " value in byteArray is : " +byte_Array[i]);
        }
        System.out.println();
    }
	  
	 
	// Short DataType
	void shortArray(int size, Scanner sc) {

		short[] shortArray = new short[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter value " + (i + 1) + " :");
			shortArray[i] = sc.nextShort();

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in shortArray is : " + shortArray[i]);
		}
		System.out.println();

	}

	// Int DataType
	void intArray(int size, Scanner sc) {

		int[] intArray = new int[size];
		

		for (int i = 0; i < size; i++) {

			System.out.println("Enter value " + (i + 1) + " :");
			intArray[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in intArray is : " + intArray[i]);
		}
		System.out.println();

	}

	// Long DataType
	void longArray(int size, Scanner sc) {

		long[] longArray = new long[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter value " + (i + 1) + " :");
			longArray[i] = sc.nextLong();

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in longArray is : " + longArray[i] + "L");
		}
		System.out.println();

	}

	// Float DataType
	void floatArray(int size, Scanner sc) {

		float[] floatArray = new float[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter value " + (i + 1) + " :");
			floatArray[i] = sc.nextFloat();

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in folatArray is : " + floatArray[i]);
		}
		System.out.println();

	}

	// Double DataType
	void doubleArray(int size , Scanner sc) {

		double[] doubleArray = new double[size];
		

		for (int i = 0; i < size; i++) {

			System.out.println("Enter value " + (i + 1) + " :");
			doubleArray[i] = sc.nextDouble();

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in doubleArray is : " + doubleArray[i]);
		}
		System.out.println();

	}
	
	
	//char DataType
	void charArray(int size, Scanner sc) {

		char[] charArray = new char[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter Character " + (i + 1) + " :");
			String input = sc.nextLine();
			
			
			charArray[i]=input.charAt(0);
			

		}
		for (int i = 0; i < size; i++) {

			System.out.println((i + 1) + " value in charArray is : " + charArray[i]);
		}
		System.out.println();

	}
	
	//String DataType
	void string_Array(int size,Scanner sc) {
		
		String[] string_Array = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter String "+(i+1)+" : ");
			string_Array[i]=sc.nextLine();
		}
		for(int i = 0;i<size;i++) {
			System.out.println((i + 1) + " value in string_Array is : " + string_Array[i]);
		}
		System.out.println();
	}
	
	

}
