package CodeStudio;

import java.util.ArrayList;
import java.util.Stack;

public class C1262298 {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        Stack<Integer> stack = new Stack<>();
        for (int i = m; i < arr.size(); i++) {
            stack.push(arr.get(i));
        }
        for (int i = m; i < arr.size(); i++) {
            arr.set(i, stack.pop());
        }
    }
}
