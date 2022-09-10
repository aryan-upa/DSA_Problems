// A little more efficient solution would be applying two binary searches, to find the first and last occurrence of
// target. link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/1809420/Java-100-faster-0ms-easy-solution-(modified)

package Leetcode;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};

        int l = 0;
        int h = nums.length - 1;

        int ans = 0;
        boolean flag = false;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                flag = true;
                h = mid - 1;
            }

            if (nums[mid] < target)
                l = mid + 1;

            else
                h = mid - 1;
        }

        if (flag) {
            res[0] = ans;
            while (++ans < nums.length && nums[ans] == target);
            res[1] = ans - 1;
        }

        return res;
    }
}
