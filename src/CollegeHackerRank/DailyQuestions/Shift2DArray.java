package CollegeHackerRank.DailyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Shift2DArray {

    private void shiftArray(int[][] arr, int k) {
        while(k>0) {
            int shiftableElement;
            shiftableElement = arr[arr.length - 1][arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = shiftableElement;
                    shiftableElement = temp;
                }
            }
            k--;
        }
    }

    private int[][] takeInput(Scanner sc) {
        System.out.print("Enter the dimension of the square matrix : ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the data for row " + (i+1) + " : ");
            for (int j = 0; j < size; j++)
                matrix[i][j] = sc.nextInt();
        }
        return matrix;
    }

    public void performFunction() {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = takeInput(sc);
        System.out.print("Enter the rotation number : ");
        int k = sc.nextInt();
        shiftArray(matrix, k);
        for (int[] arr: matrix)
            System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Shift2DArray object = new Shift2DArray();
        object.performFunction();
    }
}
