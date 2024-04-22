package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/majority-element

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_5 {

    public static void main(String[] args) {
        MajorityElement_5 ex5 = new MajorityElement_5();
        System.out.println(ex5.majorityElement(new int[]{2,2,1,3,4,2,2}));


    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>(); //1-число, 2-сколько раз

        for (int num: nums){
            numsMap.put(num, (numsMap.getOrDefault(num, 0) + 1));
        }
        System.out.println(numsMap);

        for(Map.Entry<Integer, Integer> x : numsMap.entrySet()){
            if(x.getValue() > nums.length/2) return x.getKey();
        }
        return 0;
    }

    //Альтернативное решение, чуть-чуть быстрее, чем вариант с HashMap
    public int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
