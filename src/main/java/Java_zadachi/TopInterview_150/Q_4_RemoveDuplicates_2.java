package Java_zadachi.TopInterview_150;
import java.util.Arrays;
    /*
     Оставить только по 2 числа, остальные удалить.
     Нельзя выделять память для дополнительных массивов.
        Если после удаления дубликатов осталось k элементов, то первые k элементов массива
     nums должны содержать конечный результат. Неважно, что вы оставите за пределами первых k элементов
    */

public class Q_4_RemoveDuplicates_2 {
    public static void main(String[] args) {
        Q_4_RemoveDuplicates_2 ex = new Q_4_RemoveDuplicates_2();

        int[] nums = {0, 1, 1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 6, 7, 8, 8, 8};
        System.out.println(ex.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 7, 8, 8, 8};
        System.out.println(ex.removeDuplicates2(nums));
        System.out.println(Arrays.toString(nums));

    }


    public int removeDuplicates(int[] nums) {
        int k = nums.length, i = 0;
        while (i < k - 2) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                if (i + 2 >= k) {
                    k--;
                    return k;
                } else {
                    moveLeft(nums, i + 2);
                    k--;
                }
            } else i++;
        }
        return k;
    }

    //индекс - индекс удаляемого числа
    private void moveLeft(int[] nums, int indx) {
        for (int i = indx; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    public int removeDuplicates2(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
