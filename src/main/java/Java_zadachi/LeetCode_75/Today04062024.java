package Java_zadachi.LeetCode_75;

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


}
