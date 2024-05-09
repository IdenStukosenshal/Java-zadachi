package Java_zadachi.TopInterview_150;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

public class Q_6_RotateArray {

    public static void main(String[] args) {
        Q_6_RotateArray ra6 = new Q_6_RotateArray();

        int[] nums = {1,2,3,4,5,6,7};
        int k = 7;
        ra6.rotate_V_0(nums, k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1,2,3,4,5,6,7};
        //k = 5;
        ra6.rotate_V_1(nums, k);
        System.out.println(Arrays.toString(nums));
    }


    public void rotate_V_0(int[] nums, int k) {
        if(k > nums.length){
            k %= nums.length;
        }
        int[] buf = Arrays.copyOfRange(nums, nums.length-k, nums.length);
        for (int i = nums.length-k-1; i >= 0; i--) {
            nums[i+k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = buf[i];
        }
    }

    public void rotate_V_1(int[] nums, int k) {
        if(k > nums.length){
            k %= nums.length;
        }
        int[] buf = Arrays.copyOfRange(nums, 0, nums.length-k);
        for (int i = 0; i < k; i++) {
            nums[i] = nums[nums.length-k+i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = buf[i-k];
        }
    }
}
