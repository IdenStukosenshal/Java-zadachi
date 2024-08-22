package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashSet;

public class Q_45 {
    public static void main(String[] args) {
        Q_45 q45 = new Q_45();
        System.out.println(q45.isHappy(354));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> sseth = new HashSet<>();
        while (n != 1) {
            int tmp = 0;
            while (n != 0) {
                tmp += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            n = tmp;
            if(!sseth.contains(tmp)) sseth.add(tmp);
            else return false;
        }
        return true;
    }
}

