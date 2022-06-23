package CollegeHackerRank;

import java.util.*;
import java.lang.*;

public class RatCountHouse {

    static class Pair<T,V> {
        T first;
        V second;
    }

    public static Pair<Integer[], Integer> inputArray(int n, Scanner sc) {
        Integer[] arr = new Integer[n];
        int totFood = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = val;
            totFood += val;
        }
        Pair<Integer[], Integer> output = new Pair<>();
        output.first = arr;
        output.second = totFood;
        return output;
    }

    public static void doFun() {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int U = sc.nextInt();
        int n = sc.nextInt();
        if(n!=0) {
            Pair<Integer[], Integer> output = inputArray(n, sc);
            Integer[] arr = output.first;
            int totFood = output.second;
            if (totFood < R * U) {
                System.out.println(0);
            } else {
                int tot = R * U;
                int countOfHouse = 0;
                while (tot > 0) {
                    tot -= arr[countOfHouse];
                    countOfHouse++;
                }
                System.out.println(countOfHouse);
            }
            return;
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        doFun();
    }
} 