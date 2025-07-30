package org.example.array;

public class N977 {
    public int[] sortedSquares(int[] nums) {
        int[] nary = new int[nums.length];
        int r = 0;
        while (r < nums.length && Math.abs(nums[r]) > nums[r]) r ++;
        int l = r - 1, index = 0;
        while (l >= 0 && r < nums.length) {
            if (Math.abs(nums[l]) <= nums[r]) nary[index ++] = nums[l --];
            else nary[index ++] = nums[r ++];
        }
        while (l >= 0) nary[index ++] = nums[l --];
        while (r < nums.length) nary[index ++] = nums[r ++];
        for (int i = 0; i < nary.length; i ++)
            nary[i] = nary[i] * nary[i];
        return nary;
    }
    public static void main(String[] args) {

    }
}
