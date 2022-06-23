package CollegeHackerRank.DailyQuestions;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentChars {

    public static String removeAdjacent(String initial) {
        Stack<Character> stack = new Stack<>();
        for (char eachChar : initial.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == eachChar) stack.pop();
            else stack.push(eachChar);
        }
        StringBuilder stringBuilder = new StringBuilder(stack.size());
        while(!stack.isEmpty())
            stringBuilder.append(stack.pop());
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(removeAdjacent(str));
    }
} 