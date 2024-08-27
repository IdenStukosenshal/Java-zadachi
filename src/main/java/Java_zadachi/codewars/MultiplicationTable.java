package Java_zadachi.codewars;

import java.util.Arrays;

//https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] x = multiplicationTable(3);
        for (int[] ints : x) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i+1) * (j+1);
            }
        }
        return result;
    }
}
