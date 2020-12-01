package com.javainterview.Anagrams;

import java.util.Arrays;

public class SimilarStrings {

    static int similarString(String a, String b){

        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();
        int count =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i =0;i< arr1.length;i++){
            if(Math.abs(arr1[i] - arr2[i]) !=0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String ...args){
        System.out.println(similarString("aba", "baa"));
    }

}
