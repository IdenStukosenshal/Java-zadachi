package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150

public class Q_20_LongestCommonPrefix {
    public static void main(String[] args) {
        Q_20_LongestCommonPrefix q20 = new Q_20_LongestCommonPrefix();

        System.out.println(q20.longestCommonPrefix2(new String[]{"flower", "flow", "flight"}));
        System.out.println(q20.longestCommonPrefix2(new String[]{"dog", "racecar", "car"}));
        System.out.println(q20.longestCommonPrefix2(new String[]{"day", "day"}));
        System.out.println(q20.longestCommonPrefix2(new String[]{"d"}));
        System.out.println(q20.longestCommonPrefix2(new String[]{"abc", "ab", "a", ""}));

        //String[] strs = {"a", "bc", "dba", "z", "xcva", "aaa", "aaaaaa"};
        //Arrays.sort(strs, Comparator.comparing(String::length));

    }

    public String longestCommonPrefix(String[] strs) {
        String substr, prefixFirst = "";

        for (int indx = 1; indx <= strs[0].length(); indx++) {
            int i = 0;
            prefixFirst = strs[i].substring(0, indx);
            for (; i < strs.length; i++) {
                if (indx > strs[i].length()) {
                    return prefixFirst.substring(0, prefixFirst.length() - 1);
                }
                substr = strs[i].substring(0, indx);
                if (!prefixFirst.equals(substr)) {
                    return prefixFirst.substring(0, prefixFirst.length() - 1);
                }
            }
        }
        return prefixFirst;
    }


    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs)
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
