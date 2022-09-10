package Leetcode;

public class Peak_Index_in_a_Mountain_Array {

    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid == 0 || mid == arr.length - 1) {
                if (mid == 0 && arr[mid + 1] > mid)
                    l = mid + 1;
                else
                    h = mid - 1;
            }

            else {
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                    return mid;

                if (arr[mid - 1] > arr[mid])
                    h = mid - 1;

                else
                    l = mid + 1;
            }

        }

        return h;
    }

}
