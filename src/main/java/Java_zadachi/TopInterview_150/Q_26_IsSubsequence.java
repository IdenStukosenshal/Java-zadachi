package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150

//подпоследовательность( не подстрока )
public class Q_26_IsSubsequence {
    public static void main(String[] args) {
        Q_26_IsSubsequence q26 = new Q_26_IsSubsequence();

        System.out.println(q26.isSubsequence("abc", "ahbgdc"));
        System.out.println(q26.isSubsequence("axc", "ahbgdc"));
        System.out.println(q26.isSubsequence("abcd", "abcd"));
        String x = "";
    }

    // Runtime 0 ms, Beats 100.00% of users with Java XD
    public boolean isSubsequence(String s, String t) {
        int indx = -1;
        for (int i = 0; i < s.length(); i++) {
            indx = t.indexOf(s.charAt(i), indx+1);
            if(indx == -1) return false;
        }
        return true;
    }

    public boolean isSubsequence2(String s, String t) {

        return false;
    }
}
