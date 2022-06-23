package CollegeHackerRank;

import java.util.*;

public class CalculateMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] finalArr = new int[size1 + size2];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < size1 + size2; i++) {
            if(count1 < size1 && count2 < size2) {
                if(arr1[count1] < arr2[count2]) {
                    finalArr[i] = arr1[count1];
                    count1++;
                }
                else {
                    finalArr[i] = arr2[count2];
                    count2++;
                }
            }
            else {
                if(count1 < size1) {
                    finalArr[i] = arr1[count1];
                    count1++;
                }
                else {
                    finalArr[i] = arr2[count2];
                    count2++;
                }
            }

        }

        if((size1+size2)%2 != 0) {
            int mid = (size1+size2)/2;
            float median = finalArr[mid];
            System.out.println(median);
        }
        else {
            int mid1 = (size1+size2)/2;
            int mid2 = mid1 - 1;
            float median = (float) (finalArr[mid1] + finalArr[mid2])/2;
            System.out.println(median);
        }
    }
}
