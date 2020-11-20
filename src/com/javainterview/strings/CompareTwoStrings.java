package com.javainterview.strings;
import java.util.Set;
import java.util.HashSet;

public class CompareTwoStrings {

    static String twoStrings(String s1, String s2) {

        /*
        The below code has a Time Complexity : O(n1 * n2)
         */

//        int length1 = s1.length();
//        int length2 = s2.length();
//
//        for(int i=0; i<length1; i++){
//            for(int j=0; j<length2; j++){
//                System.out.println(s1.charAt(i));
//                System.out.println(s1.charAt(j));
//                if(s1.charAt(i)==s2.charAt(j)){
//                    return "YES";
//                }
//            }
//        }
//        return "NO";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for(int j=0; j<s2.length();j++){



            if(set.contains(s2.charAt(j))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String ...args){

        String s = "hi";
        String t = "world";

        System.out.println(twoStrings(s, t));

    }
}
