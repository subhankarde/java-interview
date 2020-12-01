package com.javainterview.palindrome;

public class Palindrome {
    static String gameOfThrones(String s) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int oc = 0, ec = 0;
        int l = s.length();
        for (int i = 0; i < 26; i++) {
            int c = 0;
            for (int j = 0; j < l; j++) {
                if (a.charAt(i) == s.charAt(j))
                    c++;
            }
            if (c % 2 == 0)
                ec++;
            else
                oc++;
        }
        if (oc <= 1)
            return "YES";
        else if (oc == 2 && l % 2 == 0)
            return "YES";
        else
            return "NO";

    }

    public static void main(String[] args) {
        String subtring = "madam";
        System.out.println(gameOfThrones(subtring));

    }
}
