package Java_zadachi.TopInterview_150;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
/*  Дан отсортированный массив с повторяющимися числами, нужно удалить дубликаты(как в Set)
и вернуть количество оставшихся элементов

[0,0,1,1,1,2,2,3,3,4]  ->  [0,1,2,3,4,_,_,_,_,_], вернуть 5, "_" -- значение элемента не учитывается

 */

/*Эта задача полное дерьмо!
    Нужно изменить массив на месте, при этом элементы массива,
расположенные после уникальных элементов не должны учитываться, НО тесты всё равно учитывают их.
Поскольку в Java нельзя изменить размер массива, а только создать новый, решить эту задачу
        НЕВОЗМОЖНО

 */

public class Q_3_RemoveDuplicates_1 {

    public static void main(String[] args) {
        Q_3_RemoveDuplicates_1 ex3 = new Q_3_RemoveDuplicates_1();

        int[] nums = {1, 2, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 8, 9, 10, 10};

        ex3.removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        int i = 1;
        while (i < numsList.size()) {
            if (numsList.get(i).equals(numsList.get(i - 1))) {
                numsList.remove(i);
            } else {
                i++;
            }
        }
        i = 0;
        for (Integer x : numsList) {
            nums[i] = x;
            i++;
        }
        //System.out.println(numsList);
        //System.out.println(Arrays.toString(nums));
        //System.out.println(numsList.size());
        return nums.length;
    }

}
/*
for (i = 0; i < (nums.length - numsList.size()); i++) {
            nums[numsList.size() + i] = nums[0];
        }*/
//nums = numsList.stream().mapToInt(x -> x).toArray();
