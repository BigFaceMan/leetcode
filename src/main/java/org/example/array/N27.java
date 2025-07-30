package org.example.array;

import java.util.Arrays;

public class N27 {
    public int removeElement(int[] nums, int val) {
        int prefix = 0;
        for (int i = 0; i < nums.length; i ++) {
            nums[i - prefix] = nums[i];
            if (nums[i] == val) prefix ++;
        }
        return nums.length - prefix;
    }

    public static void main(String[] args) {
        N27 n27 = new N27();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = n27.removeElement(nums, val);
        System.out.println("New length after removing " + val + ": " + newLength); // Output: New length after removing 3: 2
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " "); // Output: Modified array: 2 2
        }
    }
}
