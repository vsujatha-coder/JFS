package com.flm;

import java.util.Scanner;

public class ByteArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ByteArray ba = new ByteArray();

        System.out.println("Enter size of byte array:");
        int size = sc.nextInt();

        ba.byte_Array(size, sc);

        sc.close();
    }

    void byte_Array(int byte_Size, Scanner sc) {
        byte[] byte_Array = new byte[byte_Size];

        for (int i = 0; i < byte_Size; i++) {
            System.out.println("Enter byte value (" + (i + 1) + "):");
            byte_Array[i] = sc.nextByte(); // User must enter -128 to 127
        }

        System.out.println("Entered byte array values:");
        for (int i = 0; i < byte_Size; i++) {
            System.out.println(byte_Array[i]);
        }
    }
}

