package CollegeHackerRank.Queue;

import java.util.*;
import java.lang.*;

public class FirstNonRepeating {
    public static void firstNonRepeating(String str) {
        int[] charCount = new int[26];
        Queue<Character> cQueue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            cQueue.add(ch);
            charCount[ch - 'a']++;
            while(!cQueue.isEmpty()) {
                if(charCount[cQueue.peek() - 'a'] > 1) {
                    cQueue.remove();
                }
                else {
                    System.out.print(cQueue.peek() + " ");
                    break;
                }
            }
            if(cQueue.isEmpty()) {
                System.out.print(-1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        firstNonRepeating(str);
    }
} 