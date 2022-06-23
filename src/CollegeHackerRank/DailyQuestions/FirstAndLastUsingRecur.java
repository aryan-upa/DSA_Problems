package CollegeHackerRank.DailyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastUsingRecur {

    public static int[] doFun(int[] arr, int data, int currIndex, int fPos, int lPos) {
        if(currIndex >= arr.length) {
            if (lPos == -1)
                lPos = fPos;
            return new int[]{fPos, lPos};
        }
        if(arr[currIndex] == data) {
            if (fPos == -1) {
                fPos = currIndex;
            }
            else {
                lPos = currIndex;
            }
        }
        return doFun(arr, data, currIndex+1, fPos, lPos);
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int len = sc.nextInt();
        System.out.print("Enter Values : ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInput();
        System.out.print("Enter the data to find : ");
        int dataToFind = sc.nextInt();
        int[] resArr = doFun(arr, dataToFind, 0, -1, -1);
        System.out.println(Arrays.toString(resArr));
    }
} 