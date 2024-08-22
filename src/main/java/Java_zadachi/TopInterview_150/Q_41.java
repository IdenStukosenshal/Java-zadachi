package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;
import java.util.Map;

//Задача очень похожая на №40
public class Q_41 {
    public static void main(String[] args) {
        Q_41 q41 = new Q_41();
        System.out.println(q41.wordPattern("abba", "dog cat cat dog")); //true
    }

    public boolean wordPattern(String pattern, String s) {
        String[] wordS = s.split(" ");
        if (pattern.length() != wordS.length) return false;
        Map<Character, String> dict = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!dict.containsKey(pattern.charAt(i))) {
                if (!dict.containsValue(wordS[i])) {
                    dict.put(pattern.charAt(i), wordS[i]);
                } else return false;
            } else {
                if (!dict.get(pattern.charAt(i)).equals(wordS[i])) return false;
            }
        }
        return true;
    }


    public boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        int len = pattern.length();
        HashMap<Character, String> map = new HashMap<>();
        if (len != words.length) return false;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(words[i])) return false;
            }
        }
        return true;
    }

}
