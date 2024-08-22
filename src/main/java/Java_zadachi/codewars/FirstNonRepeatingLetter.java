package Java_zadachi.codewars;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String s = "moomeen";
        System.out.println(FirstNonRepeatingLetter.firstNonRepeatingLetter(s));

    }
    //https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/java

    public static String firstNonRepeatingLetter(String s) {

        Set<String> csh = new HashSet<>();
        String letter;
        for (int i = 0; i < s.length(); i++) {
            letter = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {
                String anotherLetter = s.substring(j, j + 1);
                if (csh.contains(letter.toLowerCase())) break;
                if (letter.equalsIgnoreCase(anotherLetter)) {
                    csh.add(anotherLetter.toLowerCase());
                    break;
                }
            }
            if (!csh.contains(letter.toLowerCase())) return letter;
        }
        return "";
    }

}
