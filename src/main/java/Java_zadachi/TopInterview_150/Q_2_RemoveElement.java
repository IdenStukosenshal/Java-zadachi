package Java_zadachi.TopInterview_150;

import java.util.Arrays;

public class Q_2_RemoveElement {
    public static void main(String[] args) {
        var rm = new Q_2_RemoveElement();

        int[] nums = {3, 4, 5, 3, 2, 3};
        int val = 3;

        rm.method1(nums, val);

        nums = new int[]{3, 4, 5, 3, 2, 3};
        rm.methodSUS(nums, val);

    }

    public int method1(int[] nums, int val) {
        int k = nums.length;
        int i = 0, j = k - 1;
        while (i < k && j >= 0) {
            if (nums[i] == val && nums[j] != val) {
                nums[i++] = nums[j];
                nums[j--] = val;
                k--;
            } else if (nums[i] == val && nums[j] == val) {
                j--;
                k--;
            } else if (nums[i] != val) {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
        return k;
    }


    //Это работает, но непонятно как
    //???
    public int methodSUS(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(index);
        return index;
    }
}
