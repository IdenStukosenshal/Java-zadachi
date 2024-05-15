package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.Map;

public class Q_42_ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        Q_42_ValidAnagram q42 = new Q_42_ValidAnagram();
        System.out.println(q42.isAnagram2(s, t));

    }

    //Медленно работает 😭
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> freqDict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqDict.put(s.charAt(i), freqDict.getOrDefault(s.charAt(i), 0) + 1);
            freqDict.put(t.charAt(i), freqDict.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Integer x : freqDict.values()) {
            if (x != 0) return false;
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        char letter;

        Map<Character, Integer> freqDict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            freqDict.put(letter, freqDict.getOrDefault(letter, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            letter = t.charAt(i);
            if (freqDict.containsKey(letter) && freqDict.get(letter) > 0) {
                freqDict.put(letter, freqDict.getOrDefault(letter, 0) - 1);
            } else return false;
        }
        return true;
    }
}
