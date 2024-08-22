package Java_zadachi.TopInterview_150;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150

public class Q_SummaryRanges {

    public static void main(String[] args) {
        Q_SummaryRanges qsr = new Q_SummaryRanges();

        System.out.println(qsr.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));

    }
    /*
    Input: nums = [0,2,3,4,6,7,9]  если подряд - стрелочка
    Output: ["0", "2->4","6->7","9"]
    */


    public List<String> summaryRanges(int[] nums) {
        List<String> rezult = new ArrayList<>();
        if (nums.length == 0) return rezult;
        else if (nums.length <= 1) {
            rezult.add(String.valueOf(nums[0]));
            return rezult;
        }
        int leftB = nums[0], rightB = nums[1], previous;
        for (int i = 1; i < nums.length; i++) {
            rightB = nums[i];
            previous = nums[i - 1];
            if (rightB - previous != 1) {
                rezult.add(makeStr(leftB, previous));
                leftB = rightB;
            }
        }
        rezult.add(makeStr(leftB, rightB));
        return rezult;
    }

    private String makeStr(int lft, int rght) {
        StringBuilder strk = new StringBuilder();
        if (lft != rght) {
            strk.append(lft);
            strk.append("->");
            strk.append(rght);
        } else {
            strk.append(lft);
        }
        return strk.toString();
    }
}
