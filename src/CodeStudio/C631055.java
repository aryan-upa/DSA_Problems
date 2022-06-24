package CodeStudio;

public class C631055 {
    public static void sort012(int[] arr) {
        int iniPointer = 0;

        for (int j = 0; j < 3; j++) {
            for (int i = iniPointer; i < arr.length; i++) {
                if ( arr[i] == j ) {
                    int temp = arr[iniPointer];
                    arr[iniPointer] = j;
                    arr[i] = temp;
                    iniPointer++;
                }
            }
        }
    }
}
