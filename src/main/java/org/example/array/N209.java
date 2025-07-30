package org.example.array;

import java.util.Scanner;

public class N209 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int res  = nums.length + 1;
        for (int i = 0, j = 0; i < nums.length; i ++) {
            while (j < nums.length && sum < target) sum += nums[j ++];
            System.out.println("i: " + i + ", j: " + j + ", sum: " + sum);
            if (sum >= target) {
                res = Math.min(res, j - i);
            }
            sum -= nums[i];
        }
        return res == nums.length + 1 ? 0 : res;
    }
    public static void main(String[] args) {
        N209 n209 = new N209();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = n209.minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray with sum >= " + target + ": " + result); // Output: Minimum length of subarray with sum >= 7: 2
        Scanner sc = new Scanner(System.in);
    }
}
