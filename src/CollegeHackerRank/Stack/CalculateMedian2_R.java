package CollegeHackerRank.Stack;

import java.util.*;
import java.lang.*;

public class CalculateMedian2_R {

    public static void deleteMid(Stack<Integer> stack, int n, int curr) {
        if(stack.isEmpty() || curr == n) {
            return;
        }
        int x = stack.pop();
        deleteMid(stack, n, curr+1);

        if(curr!=n/2)
            stack.push(x);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        deleteMid(stack, n, 0);
        while(!stack.isEmpty()) {
            int p = stack.pop();
            System.out.print(p + " ");
        }
    }
} 