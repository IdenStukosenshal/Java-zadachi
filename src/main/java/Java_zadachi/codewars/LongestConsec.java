package Java_zadachi.codewars;

public class LongestConsec {
    public static void main(String[] args) {

        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        //abigailtheta
    }

    //https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java
    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) return "";
        int l = 0, r = k - 1, maxL, currLength = 0;
        for (int i = 0; i < k; i++) {
            currLength += strarr[i].length();
        }
        maxL = currLength;
        for (int i = 0; i < strarr.length - k; i++) {
            currLength = currLength - strarr[i].length() + strarr[k + i].length();
            if (currLength > maxL) {
                l = i + 1;
                r = k + i;
                maxL = currLength;
            }
        }
        StringBuilder result = new StringBuilder(strarr[l]);
        for (int i = l + 1; i <= r; i++) {
            result.append(strarr[i]);
        }
        return result.toString();
    }
}
