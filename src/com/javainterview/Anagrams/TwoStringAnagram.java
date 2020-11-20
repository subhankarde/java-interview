package com.javainterview.Anagrams;

import java.util.Arrays;

public class TwoStringAnagram {

    static boolean anagram(String a, String b){
        char [] string1 = a.toCharArray();
        char [] string2 = b.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);


        return Arrays.equals(string1, string2);
    }
    public static void main(String ... args){

        System.out.println(anagram("mo","om"));

    }
}
