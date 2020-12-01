package com.javainterview.strings;

import java.util.Arrays;
/*
https://www.hackerrank.com/challenges/string-construction/problem?h_r=next-challenge&h_v=zen
 */
public class StringConstruction {
    static int stringConstruction(String s) {

        char [] arr1 = s.toCharArray();
        int count1[] = new int[26];
        int count=0;
        for(int i=0; i<arr1.length; i++){
            count1[arr1[i] - 'a']++;
        }
        //System.out.println( Arrays.toString(count1));
        for(int i=0; i<count1.length; i++){
            if(count1[i]>=1){
                count++;
            }
        }
        return count;
    }


}
