package Leetcode;

import java.util.Stack;

public class ValidParenthesis {

    // Approach 1: With using Stack DS runtime: 3ms
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] braces = s.toCharArray();
        for(char c : braces) {
            if ("{([".indexOf(c) != -1)
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char topBrace = stack.pop();
                switch(topBrace) {
                    case '{' : if (c != '}') return false;
                    break;
                    case '(' : if (c != ')') return false;
                    break;
                    case '[' : if (c != ']') return false;
                    break;
                }
            }
        }

        return stack.isEmpty();
    }

    // Approach 2: Without using Stack DS, but runtime is extremely high 49ms due to while loop.
    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) return false; // odd length string can never be valid.
        int len = -1;
        while (s.length() != len) { // while no length change is observed in the string due to loop.
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.length() == 0;
    }

    // Approach 3rd using stack but in array. runtime: 1ms
    public boolean isValid3(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (top < -1)
                return false;
            if ("{([".indexOf(c) != -1)
                stack[++top] = c;
            else if (top > -1) {
                switch (c) {
                    case ')': if (stack[top] != '(') return false;
                        break;
                    case ']': if (stack[top] != '[') return false;
                        break;
                    case '}': if (stack[top] != '{') return false;
                        break;
                }
                top--;
            }
            else top--;
        }
        return top == -1;
    }

}
