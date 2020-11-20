package com.javainterview.Anagrams;

import java.util.Scanner;

public class SherlockAndAnagrams {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        }


    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
            char ch = a.charAt(j);
            lettermap[ch - 'a']++;
            ch = b.charAt(j);
            lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
            if(lettermap[j] != 0){
                return false;
            }
        }
        return true;
    }
}