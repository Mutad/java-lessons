package com.company.lesson1;

import java.util.Scanner;

public class L1Exs {


    public static void zad3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your palindrome: ");
        String s = scanner.nextLine();
        System.out.println(s + "  -  " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }


    public static void zad5() {
        String s1 = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))";
        System.out.println(s1 + "  -  " + (checkNawiasy(s1) ? "OK" : "NOT OK"));

        String s2 = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)";
        System.out.println(s2 + "  -  " + (checkNawiasy(s2) ? "OK" : "NOT OK"));
    }

    public static Boolean checkNawiasy(String s) {
        int unclosed = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                unclosed++;
            else if (s.charAt(i) == ')')
                unclosed--;
        }
        return unclosed == 0;
    }


    public static void zad4() {
        String s1 = "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi.";
        System.out.println(s1 + "  -  " + sumNumbers(s1));
    }

    public static Integer sumNumbers(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.digit(ch, 10);
            }
        }

        return sum;
    }


    public static void zad1() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1))
                sum++;
        }

        System.out.println(sum);
    }
}
