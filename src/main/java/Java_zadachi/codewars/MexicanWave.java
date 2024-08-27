package Java_zadachi.codewars;

public class MexicanWave {
    public static void main(String[] args) {

    }

    //https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
    public static String[] wave1(String str) {
        int lengthMassive = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) lengthMassive++;
        }
        String[] result = new String[lengthMassive];
        StringBuilder word;
        for (int i = 1, indx = 0; i <= str.length(); i++) {
            if (Character.isLetter(str.charAt(i-1))) {
                word = new StringBuilder(str.substring(0, i-1));
                word.append(str.substring(i-1, i).toUpperCase());
                word.append(str.substring(i));
                result[indx] = word.toString();
                indx++;
            }
        }
        return result;
    }
}
