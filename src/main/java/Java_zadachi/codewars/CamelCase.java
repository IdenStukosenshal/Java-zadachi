package Java_zadachi.codewars;

import java.util.Arrays;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase(""));
        System.out.println(camelCase(" "));
        System.out.println(camelCase("  "));
        System.out.println(camelCase("        "));
        System.out.println(camelCase(" hello, camel case world       "));
        System.out.println(camelCase("k"));
    }

    //Можно ли решить эту задачу в одну строку?
    public static String camelCase(String str) {
        return !str.isBlank() ? String.join("", Arrays.stream(str.strip().split("\\s+"))
                .map(word -> (word.substring(0, 1).toUpperCase() + word.substring(1)))
                .toList()
                .toArray(new String[0])) : "";
    }


    public static String reserv(String str) {
        if (str.isBlank()) return "";
        return String.join("", Arrays.stream(str.strip().split("\\s+"))
                .map(word -> (word.substring(0, 1).toUpperCase() + word.substring(1)))
                .toList()
                .toArray(new String[0]));
    }
}
