package Java_zadachi.LeetCode_75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Today04062024 {
    public static void main(String[] args) {
        //String strk = "dgdrgedggjfsdcs";
        //System.out.println(count(strk));

        //System.out.println(Arrays.toString(wave1(" hello world ")));
        //System.out.println(Arrays.toString(wave1("a       b    ")));


    }

    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> result = new HashMap<>();
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);
            result.put(letter, result.getOrDefault(letter, 0) + 1);
        }
        return result;
    }

    //https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
    public static String[] wave1(String str) {
        int lengthMassive = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) lengthMassive++;
        }
        String[] result = new String[lengthMassive];
        StringBuilder word;
        for (int i = 1, indx = 0; i <= str.length(); i++) {
            if (Character.isLetter(str.charAt(i-1))) {
                word = new StringBuilder(str.substring(0, i-1));
                word.append(str.substring(i-1, i).toUpperCase());
                word.append(str.substring(i));
                result[indx] = word.toString();
                indx++;
            }
        }
        return result;
    }


}
