package CollegeHackerRank.DailyQuestions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MoveZeroesArray {

    public static void doFun() {
        int[] arr = takeInput();

        boolean hasAllZeroShifted = false;
        int arrLen = arr.length;
        for (int i = 0; i < arrLen && !hasAllZeroShifted ; i++) {
            if(isCurrentZero.test(arr[i])) {
                int nextNonZeroPos = returnNextNonZero.apply(arr, i);
                if(nextNonZeroPos == -1)
                    hasAllZeroShifted = true;
                else
                    shiftAllElementsToRight(arr, i, nextNonZeroPos);
            }
        }

        printArray(arr);
    }

    public static void shiftAllElementsToRight(int[] arr, int startingPos, int endPos)  {
        int finalElement = arr[endPos];
        for (int i = startingPos; i < endPos; i++) {
            arr[i+1] = arr[i];
        }
        arr[startingPos] = finalElement;
    }

    static BiFunction<int[], Integer, Integer> returnNextNonZero = (arr, startingPos) -> {
        while (startingPos < arr.length) {
            if(arr[startingPos] != 0)
                return startingPos;
            startingPos++;
        }
        return -1;
    };

    static Predicate<Integer> isCurrentZero = number -> number == 0;

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        int i = 0;
        while(i < sizeOfArray) {
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        doFun();
    }
} 