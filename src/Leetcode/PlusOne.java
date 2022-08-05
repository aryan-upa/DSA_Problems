package Leetcode;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++)
            arr[i] = digits[len - i - 1];

        arr[0] += 1;
        int carry = 0;
        for(int i = 0; i < len; i++) {
            if (carry == 1) {
                arr[i] += 1;
                carry = 0;
            }
            if (arr[i] == 10) {
                arr[i] = 0;
                carry = 1;
            }
        }

        // System.out.println(Arrays.toString(arr));

        if (carry == 1) {
            int[] arrExtended = new int[len + 1];
            System.arraycopy(arr, 0, arrExtended, 0, len);
            arrExtended[len - 1] = 0;
            arrExtended[len] = 1;
            arr = arrExtended;
        }

        len = arr.length;

        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }

        return arr;
    }

}
