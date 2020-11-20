package com.javainterview.Anagrams;


import java.util.*;

public class SherlockAndAnagrams {
    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("abba"));

    }

    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> anagram = new HashMap();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                char[] c = s.substring(i, j).toCharArray();

                Arrays.sort(c);
                String k = new String(c);
                if (anagram.containsKey(k)) {
                    anagram.put(k, anagram.get(k) + 1);
                } else {
                    anagram.put(k, 1);
                }
            }
        }

        for (String pair : anagram.keySet()) {
            int c = anagram.get(pair);
            count = count + (c * (c - 1)) / 2;

        }
        return count;
    }

}