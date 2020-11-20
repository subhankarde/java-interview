package com.javainterview.strings;

public class SubstringInString {

    static void subString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(i+", "+j);
                System.out.println(str.substring(i,j));

            }
        }

    }


    // Driver program to test above function
    public static void main(String[] args) {
        String subtring = "Chaitanya";
        subString(subtring);

    }
}
