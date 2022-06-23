package CodeChef.FEB221C;

import java.lang.*;
import java.util.*;

public class REMADJ {

    public static int findMax(ArrayList<Integer> list, int len) {
        int max = list.get(0);
        for (int i = 1; i < len; i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }

    public static boolean twoValCheck(ArrayList<Integer> list) {
        return list.get(0) == list.get(1);
    }

    public static int doFun(ArrayList<Integer> list, int len) {
        int firstVal = list.get(0);
        boolean notAllEqual = false;
        for (int i = 0; i < len; i++) {
            if(firstVal != list.get(i)) {
                notAllEqual = true;
                break;
            }
        }
        if(list.toArray().length != 1 && notAllEqual) {
            if(len == 2) {
                if(twoValCheck(list))
                    return 0;
                else
                    return 1;
            }
            int max = findMax(list, len);
            int prev_sum = 0;
            int numOfOperation = 0;
            int totOperation = 0;
            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                int val = list.get(i);
                if (val != max) {
                    prev_sum += val;
                    numOfOperation++;
                }
                else {
                    newList.add(val);
                }

                if (prev_sum == max) {
                    totOperation += numOfOperation - 1;
                    newList.add(prev_sum);
                    numOfOperation = 0;
                    prev_sum = 0;
                }
            }
            if(prev_sum != 0) {
                newList.add(prev_sum);
                totOperation += numOfOperation - 1;
            }
            return totOperation + doFun(newList, newList.toArray().length);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int len = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                list.add(sc.nextInt());
            }
            if(len > 2)
                System.out.println(doFun(list, len));
            else {
                if(twoValCheck(list))
                    System.out.println("0");
                else
                    System.out.println("1");
            }
            T--;
        }
    }
}
