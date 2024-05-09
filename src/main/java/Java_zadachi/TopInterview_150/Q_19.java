package Java_zadachi.TopInterview_150;

import java.util.Arrays;

//https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
public class Q_19 {
    public static void main(String[] args) {
        Q_19 q19 = new Q_19();

        System.out.println(q19.lengthOfLastWord("   fly me   to   the moon  "));

    }

    public int lengthOfLastWord(String s) {
        String[] str_massive = s.split("\\s+"); //любое количество пробелов
        return str_massive[str_massive.length-1].length();
    }

    public int lengthOfLastWord2(String s) {
        String[] str_massive = s.split(" ");
        return str_massive[str_massive.length-1].length();
    }

}
