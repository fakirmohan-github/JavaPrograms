package com.ps.dsa.stack;
import java.util.Stack;

public class BalancedParanthesis {

    // Function to check if the parentheses are balanced
    public static boolean isBalanced(String s) {
        // Create a stack to store opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if the stack is empty (no opening bracket for this closing bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the top element matches the corresponding opening bracket
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isBalanced("()"));        // true
        System.out.println(isBalanced("()[]{}"));    // true
        System.out.println(isBalanced("(}"));        // false
        System.out.println(isBalanced("([)]"));      // false
        System.out.println(isBalanced("((()))"));    // true
        System.out.println(isBalanced("{[()]}"));    // true
    }
}
