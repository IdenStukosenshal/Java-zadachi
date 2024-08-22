package Java_zadachi.codewars;

public class RangeExtraction {
    public static void main(String[] args) {

        System.out.println(RangeExtraction.rangeExtraction(new int[]{-12, -10, -9, -8, -6, 14, 15, 17, 18, 19, 20}));
        System.out.println(RangeExtraction.rangeExtraction(new int[]{-10, -9, -8, -6, 14, 15, 17, 18, 19, 21}));
        System.out.println(RangeExtraction.rangeExtraction(new int[]{14, 15, 16, 17, 18, 19, 20}));
        System.out.println(RangeExtraction.rangeExtraction(new int[]{14, 16, 18, 20, 22}));
    }
    //https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java


    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int leftIndx = 0, rightIndx = 0;
        for (int i = 1; i < arr.length; i++, rightIndx++) {
            if (arr[i] - arr[rightIndx] != 1) {
                addRange(result, leftIndx, rightIndx, arr);
                result.append(",");
                leftIndx = i;
            }
            if (i == arr.length - 1) {
                addRange(result, leftIndx, i, arr);
            }
        }
        return result.toString();
    }

    private static void addRange(StringBuilder result, int leftIndx, int rightIndx, int[] arr) {
        if (rightIndx - 1 == leftIndx) {
            result.append(arr[leftIndx]).append(",").append(arr[rightIndx]);
        } else if (leftIndx == rightIndx) {
            result.append(arr[leftIndx]);
        } else {
            result.append(arr[leftIndx]).append("-").append(arr[rightIndx]);
        }
    }
}
