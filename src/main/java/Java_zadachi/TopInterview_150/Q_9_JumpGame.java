package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
//можно прыгать на ЛЮБОЕ количество шагов <= числа, если число == 2, то прыгать можно на 1 и 2

//Вспомнить про жадный алгоритм и задачу про кузнечика DP

public class Q_9_JumpGame {
    public static void main(String[] args) {
        Q_9_JumpGame q9 = new Q_9_JumpGame();

        int[] nums = {2, 1, 1, 0, 4};
        System.out.println(q9.canJump(nums));

    }

    public boolean canJump(int[] nums) {

        return false;
    }
}
