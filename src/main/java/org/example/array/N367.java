package org.example.array;

public class N367 {
    public boolean isPerfectSquare(int num) {
        long l = 1l, r = num;
        while (l < r) {
            Long mid = l + r + 1 >> 1;
            if (mid * mid <= num) l = mid;
            else r = mid - 1;
        }
        return l * l == num;
    }
    public static void main(String[] args) {
        N367 n367 = new N367();
        int num = 16;
        boolean result = n367.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result); // Output: Is 16 a perfect square? true

        num = 14;
        result = n367.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result); // Output: Is 14 a perfect square? false
    }
}
