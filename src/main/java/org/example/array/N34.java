package org.example.array;

public class N34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        int[] res = {-1, -1};
        if (nums.length > 0 && nums[l] == target) res[0] = l;
        l = 0;
        r = nums.length - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= target) l = mid;
            else r = mid - 1;
        }
        if (nums.length > 0 && nums[l] == target) res[1] = l;
        return res;
    }
    public static void main(String[] args) {
        N34 n34 = new N34();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = n34.searchRange(nums, target);
        System.out.println("Range of target " + target + ": [" + result[0] + ", " + result[1] + "]"); // Output: Range of target 8: [3, 4]

        target = 6;
        result = n34.searchRange(nums, target);
        System.out.println("Range of target " + target + ": [" + result[0] + ", " + result[1] + "]"); // Output: Range of target 6: [-1, -1]
    }
}
