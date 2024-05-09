package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class Q_21_RewerseWordsInaString {
    public static void main(String[] args) {
        Q_21_RewerseWordsInaString q21 = new Q_21_RewerseWordsInaString();

        System.out.println(q21.reverseWords("  a good   example          ")); //"example good a"
    }


    public String reverseWords(String s) {
        String[] str_massive = s.strip().split("\\s+"); //любое количество пробелов
        StringBuilder stRezult = new StringBuilder();
        for (int i = str_massive.length - 1; i >= 0; i--) {
            stRezult.append(str_massive[i]);
            if (i != 0) {
                stRezult.append(" ");
            }
        }
        System.out.println(Arrays.toString(str_massive));
        return stRezult.toString();
    }
}
