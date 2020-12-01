package com.javainterview.Anagrams;

import java.util.*;
import java.util.Arrays;

public class MakingAnagrams {
    static int makingAnagrams(String str1, String str2) {

        /*
        1. Create an array of 26 english characters to hold the count of occurrences
        2. Substract 'a' ~ ASCII value of 65 from each character in the string
        3. The 2 count arrays will hold the occurrences of each character in the string
        4. Iterate both the counter arrays and substract the value and sum it
        5. The sum will be the result
         */
        int count1[] = new int[26];
        int count2[] = new int[26];

        for (int i = 0; i < str1.length() ; i++) {
            count1[str1.charAt(i) -'a']=count1[str1.charAt(i) -'a']+1;
        }

        for (int i = 0; i < str2.length() ; i++) {
            count2[str2.charAt(i) -'a']++;
        }




        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count1[i] - count2[i]);
        }

        return result;

    }
    public static void main(String ... args){

       System.out.println(makingAnagrams("abc","anopb"));

    }
}
