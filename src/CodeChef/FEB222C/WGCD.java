package CodeChef.FEB222C;

import java.util.*;
import java.lang.*;

public class WGCD {

    public static int returnNumberToSubtract(int num, int base) {
        if(base == 1) {
            return 1;
        }
        if(num < base)
            return num;
        else
            return num%base;
    }

    public static int checkForThisNumber(int num, int[] arr, int numberOfElements, int sumOfB) {
        int sumOfTempBs = 0;
        for (int i = 0; i < numberOfElements; i++) {
            sumOfTempBs += returnNumberToSubtract(arr[i], num);
            if(sumOfTempBs > sumOfB)
                return 2;
        }
        if(sumOfTempBs == sumOfB)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {

            int numberOfElements = sc.nextInt();
            int sumOfB = sc.nextInt(); //M
            int[] A = new int[numberOfElements];
            for (int i = 0; i < numberOfElements; i++) {
                A[i] = sc.nextInt();
            }

            int maxGCD = 1;

            for(int i = 1; i<=sumOfB; i++) {
                int isGCD = checkForThisNumber(i, A, numberOfElements, sumOfB);
//                if(isGCD == 2)
//                    break;
//                else {
                    if(isGCD == 1)
                        maxGCD = i;
//                }
            }

            System.out.println(maxGCD);

            T--;
        }
    }
}
