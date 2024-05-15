package Java_zadachi.TopInterview_150;


//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

//Можно ли составить строку ransomNote из букв строки magazine
//каждая буква может быть использована только 1 раз

import java.util.HashMap;
import java.util.Map;

public class Q_39_RansomNote {
    public static void main(String[] args) {
        Q_39_RansomNote q39 = new Q_39_RansomNote();

        System.out.println(q39.canConstruct("william jex ", "  qwertyuiiopllkjhgfdsazxcvbnm"));

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqDict = new HashMap<>();
        char letter;
        for (int i = 0; i < magazine.length(); i++) {
            letter = magazine.charAt(i);
            freqDict.put(letter, freqDict.getOrDefault(letter, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            letter = ransomNote.charAt(i);
            if (freqDict.containsKey(letter)) {
                freqDict.replace(letter, freqDict.get(letter) - 1);
                if (freqDict.get(letter) <= -1) return false;
            } else return false;
        }
        return true;
    }


    //быстрее в 5 раз
    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] counter = new int[26];

        for (char letter : magazine.toCharArray())
            counter[letter - 'a']++;

        for (char letter : ransomNote.toCharArray()) {
            if (counter[letter - 'a'] == 0) return false;
            counter[letter - 'a']--;
        }
        return true;
    }
}
