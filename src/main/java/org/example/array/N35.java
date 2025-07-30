package org.example.array;

public class N35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        N35 n35 = new N35();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = n35.searchInsert(nums, target);
        System.out.println("Index to insert target " + target + ": " + result); // Output: Index to insert target 5: 2

        target = 2;
        result = n35.searchInsert(nums, target);
        System.out.println("Index to insert target " + target + ": " + result); // Output: Index to insert target 2: 1

        target = 7;
        result = n35.searchInsert(nums, target);
        System.out.println("Index to insert target " + target + ": " + result); // Output: Index to insert target 7: 4

        target = 0;
        result = n35.searchInsert(nums, target);
        System.out.println("Index to insert target " + target + ": " + result); // Output: Index to insert target 0: 0
    }
}
