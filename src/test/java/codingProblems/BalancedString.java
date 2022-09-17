package codingProblems;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string:: ");
//        String str = scanner.next();
        System.out.println(balancedParenthesis("{[]}"));
    }

    private static boolean balancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != ')') {
                    return false;
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
