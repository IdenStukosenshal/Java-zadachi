package Java_zadachi.TopInterview_150;


//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

public class Q_23 {

    public static void main(String[] args) {
        Q_23 q23 = new Q_23();
        System.out.println(q23.strStr("leetcode", "leetoo"));
        System.out.println(q23.strStr2("leetcode", "leetcode"));

    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        String substr;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            substr = haystack.substring(i, i + needle.length());
            if (substr.equals(needle)) return i;
        }
        return -1;
    }
}
