package CollegeHackerRank.Stack;

import java.util.*;
import java.lang.*;

public class CalculateMedian2 {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int numberOfElements = sc.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            stack.push(sc.nextInt());
        }

        int median = stack.size()/2;
        for (int i = 0; i < numberOfElements; i++) {
            if(i == median)
                stack.pop();
            else
                System.out.print(stack.pop() + " ");
        }
    }

}