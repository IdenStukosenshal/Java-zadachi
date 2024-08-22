package Java_zadachi.TopInterview_150;

//https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q_Valid_Parentheses {
    public static void main(String[] args) {
        Q_Valid_Parentheses qvp = new Q_Valid_Parentheses();
        System.out.println(qvp.isValid("{([(())])}"));


    }

    //Speed: 3ms
    public boolean isValid(String s) {
        ArrayList<Character> pOpen = new ArrayList<>(List.of('(', '[', '{')); //"(", "[", "{"
        ArrayList<Character> pClose = new ArrayList<>(List.of(')', ']', '}'));
        char letter;

        Deque<Character> stack = new LinkedList<>(); //push(), pop()

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            if (pOpen.contains(letter)) {
                stack.push(letter);
            } else {
                if (!stack.isEmpty() && pOpen.indexOf(stack.getFirst()) == pClose.indexOf(letter)) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    //Speed: 1ms
    public boolean isValid2(String s) {
        char letter;
        Deque<Character> stack = new LinkedList<>(); //push(), pop(), isEmpty(), getFirst()

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            if (letter == '(' || letter == '[' || letter == '{') {
                stack.push(letter);
            } else {
                if (!stack.isEmpty() && pEquals(stack.getFirst(), letter)) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean pEquals(Character s1, Character s2) {
        return (s1 == '(' && s2 == ')') || (s1 == '[' && s2 == ']') || (s1 == '{' && s2 == '}');
    }


    public boolean isValid5(String braces) {
        char letter;
        Deque<Character> stack = new LinkedList<>(); //pop(), push(), isEmpty(), getFirst()
        for (int i = 0; i < braces.length(); i++) {
            letter = braces.charAt(i);
            if (letter == '(' || letter == '[' || letter == '{') {
                stack.push(letter);
            } else if (!stack.isEmpty() && pEquals(stack.getFirst(), letter)) {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}
