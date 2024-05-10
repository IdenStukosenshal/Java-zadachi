package Java_zadachi.TopInterview_150;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150


public class Q_25_ValidPalindrome {

    public static void main(String[] args) {
        Q_25_ValidPalindrome q25 = new Q_25_ValidPalindrome();

        System.out.println(q25.isPalindrome("A man, a plan, a canal: Panama")); // "amanaplanacanalpanama", true
        System.out.println(q25.isPalindrome("race a car")); //"raceacar", false
        System.out.println(q25.isPalindrome("."));
        System.out.println(q25.isPalindrome("0p"));
        System.out.println(q25.isPalindrome(".a"));
        System.out.println(q25.isPalindrome2("     abba"));
    }

    public boolean isPalindrome(String s) {
        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                letters.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        if (letters.isEmpty()) return true;
        for (int l = 0, r = letters.size() - 1; l < letters.size() / 2; l++, r--) {
            if (!letters.get(l).equals(letters.get(r))) return false;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        char left, right;

        for (int l = 0, r = s.length() - 1; l < s.length(); ) {
            left = Character.toLowerCase(s.charAt(l));
            right = Character.toLowerCase(s.charAt(r));
            if (Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)) {
                if (l >= r) return true;
                else if (left == right) {
                    l++;
                    r--;
                } else return false;
            } else if (!Character.isLetterOrDigit(left)) {
                l++;
            } else if (!Character.isLetterOrDigit(right)) {
                r--;
            }
        }
        return true;
    }
}
