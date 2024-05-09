package Java_zadachi.TopInterview_150;

import java.util.Arrays;

/*
https://leetcode.com/problems/merge-sorted-array/description/
 */

public class Q_1_MergeSortedArray {
    public static void main(String[] args) {
        Q_1_MergeSortedArray mm = new Q_1_MergeSortedArray();


        int[] nums1 = {1, 4, 7, 8, 10, 0, 0};
        int[] nums2 = {2, 9};
        mm.method2(nums1, 5, nums2, 2);

        nums1 = new int[]{0};
        nums2 = new int[]{1};
        //mm.method3(nums1, 0, nums2, 1);


    }
//==================================================================================================
    //начать с меньших чисел, более сложно
    void method1(int[] nums1, int m, int[] nums2, int n) {

        modify(nums1, m);

        int i = nums1.length - m, j = 0;

        for (int k = 0; k < nums1.length; k++) {
            if (i == nums1.length) {
                nums1[k] = nums2[j++];
            } else if (j == n) {
                nums1[k] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                nums1[k] = nums1[i++];
            } else {
                nums1[k] = nums2[j++];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    //Перемещает числа в правую часть массива
    //{1, 4, 6, 8, 0, 0, 0};  length = 7, m = 4  -->{0, 0, 0, 1, 4, 6, 8}
    private void modify(int[] nums1, int m) {
        if (nums1.length == m) return;
        for (int i = 0; i < m; i++) {
            nums1[nums1.length - 1 - i] = nums1[m - 1 - i];
            nums1[m - 1 - i] = 0;
        }
    }

//==================================================================================================

    //nums1 = {1, 4, 6, 8, 0, 0, 0};  length = 7, m = 4,  nums2 = {2, 5, 7}, n = 3;
    public void method2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //последнее число nums1
        int j = n - 1; //последнее число nums2
        int k = nums1.length - 1; //последняя ячейка nums1, для вставки

        for (; k >= 0; k--) {
            if (j >= 0 && i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else if (j >= 0) {
                nums1[k] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

//==================================================================================================

    //nums1 = {1, 4, 6, 8, 0, 0, 0};  length = 7, m = 4,  nums2 = {2, 5, 7}, n = 3;
    public void method3(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //последнее число nums1
        int j = n - 1; //последнее число nums2
        int k = nums1.length - 1; //последняя ячейка nums1, для вставки

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
