package Java_zadachi.TopInterview_150.UNSOLVED;

//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150

//nums[i] == nums[j]
//abs(i - j) <= k

import java.util.HashMap;

public class Q_46 {
    public static void main(String[] args) {
        Q_46 q46 = new Q_46();

        System.out.println(q46.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); //false
        System.out.println(q46.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); //true

    }

    //Не мое решение
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (dict.containsKey(nums[i])) {
                if (i - dict.get(nums[i]) <= k) {
                    return true;
                }
            }
            dict.put(nums[i], i);
        }

        return false;
    }

}
