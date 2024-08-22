package Java_zadachi.TopInterview_150;

import java.util.*;

//https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150

public class Q_40_IsomorphicStrings {
    public static void main(String[] args) {
        Q_40_IsomorphicStrings q40 = new Q_40_IsomorphicStrings();

        System.out.println(q40.isIsomorphic2("add","egg"));
        System.out.println(q40.isIsomorphic2("baba","badc"));
        System.out.println(q40.isIsomorphic2("badc", "baba"));
        System.out.println(q40.isIsomorphic2("foo", "bar"));
        System.out.println(q40.isIsomorphic2("bar", "foo"));
        System.out.println(q40.isIsomorphic2("paper","title"));
    }

    //моё решение, медленное
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!sMap.containsKey(s.charAt(i)) && !tMap.containsKey(t.charAt(i))){
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
            }
            else if(!sMap.containsKey(s.charAt(i)) || sMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
             }
            else if(!tMap.containsKey(t.charAt(i)) || tMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //решение более быстрое
    public boolean isIsomorphic2(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == null) {
                if (!mp.containsValue(t.charAt(i))) {
                    mp.put(s.charAt(i), t.charAt(i));
                } else return false;
            } else {
                if (mp.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic3(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mp.containsKey(s.charAt(i))) {
                if (!mp.containsValue(t.charAt(i))) {
                    mp.put(s.charAt(i), t.charAt(i));
                } else return false;
            } else {
                if (mp.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return true;
    }
}
