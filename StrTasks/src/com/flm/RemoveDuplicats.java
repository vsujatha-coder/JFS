package com.flm;

public class RemoveDuplicats {
    public static void main(String[] args) {
        String old = "Program";
        int len_old = old.length();
        String new_w = "";
        
        for (int i = 0; i < len_old; i++) {
            char current = old.charAt(i);
            boolean found = false;

            // Check if current char is already in new_w
            for (int j = 0; j < new_w.length(); j++) {
                if (current == new_w.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // If not found, add to new_w
            if (!found) {
                new_w = new_w + current;
            }
        }

        System.out.println("Original: " + old);
        System.out.println("Without duplicates: " + new_w);
    }
}
