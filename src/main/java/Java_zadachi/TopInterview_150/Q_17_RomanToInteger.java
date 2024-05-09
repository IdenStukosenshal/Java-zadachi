package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q_17_RomanToInteger {
    public static void main(String[] args) {

        Q_17_RomanToInteger q_17 = new Q_17_RomanToInteger();

        System.out.println(q_17.romanToInt2("CMXII")); //912

        //switch быстрее чем map.put, map.put быстрее чем Map.of ???

        /*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        */
    }

    public int romanToInt(String s) {
        int rezult = 0;
        Map<String, Integer> romanDict = new HashMap<>(Map.of(
                "I", 1, "V", 5, "X", 10,
                "L", 50, "C", 100, "D", 500,
                "M", 1000));

        String[] letters = s.split("");
        List<Integer> numbers = new ArrayList<>(List.of(0));

        for (String letter : letters) {
            numbers.add(romanDict.get(letter));
        }
        for (int l = numbers.size() - 2, r = l + 1; l >= 0 && r >= 0; ) {
            if (numbers.get(l) < numbers.get(r)) {
                rezult += numbers.get(r) - numbers.get(l);
                l -= 2;
                r -= 2;
            } else if (numbers.get(l) >= numbers.get(r)) {
                while (l >= 0 && numbers.get(l) >= numbers.get(l + 1)) {
                    l--;
                }
                rezult += numbers.subList(l + 1, r + 1).stream().mapToInt(Integer::intValue).sum();
                rezult -= numbers.get(l);
                l -= 2;
                r = l + 1;
            }
        }
        return rezult;
    }

    public int romanToInt3(String s) {
        int rezult = 0, currentValue;
        Map<Character, Integer> romanDict = new HashMap<>();
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            currentValue = romanDict.get(s.charAt(i));
            if (i < s.length() - 1 && romanDict.get(s.charAt(i + 1)) > currentValue){
                rezult -= currentValue;
            } else {
                rezult += currentValue;
            }
        }
        return rezult;
    }


    //Самое быстрое
    public int romanToInt2(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = convertRomantoInt(s.charAt(i));
            if (i < s.length() - 1 && convertRomantoInt(s.charAt(i + 1)) > value) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

    private int convertRomantoInt(char input) {
        switch (input) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0; // Handle invalid characters
        }
    }

}
