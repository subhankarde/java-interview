package com.javainterview.strings;

import java.util.Arrays;
/*
https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 */
public class SherlockAndValidString {


    static String isValid(String s) {


        final String YES = "YES";
        final String NO = "NO";

        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i = 0;
        while (letters[i] == 0) {
            i++;
        }

        System.out.println(i);

        int MIN = letters[i];//Minimum frequency in the array
        int MAX = letters[25];//Max frequency in the array

//        System.out.println(MIN);
//        System.out.println(MAX);
        System.out.println(Arrays.toString(letters));

        if (MIN == MAX) {
            //All the frequency of occurance are same
            return YES;

        } else {
            if (((MAX - MIN == 1)  //Minimum required to meet the use-case
                    && (MAX > letters[24])) //Check if MAX is a single occurrence in the array
                    ||

                    ((MIN==1) && (letters[i + 1] == MAX))) //This condition is for cases where we have minimum as one and sequence of max's example : (cddee)
            {
                return YES;
            }

        }

        return NO;
    }


    public static void main(String... args) {

        System.out.println(isValid("cddee"));
    }
}