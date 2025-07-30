package org.example.array;

public class N69 {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (mid * mid <= x) l = mid;
            else r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        N69 n69 = new N69();
        int x = 4;
        int result = n69.mySqrt(x);
        System.out.println("Square root of " + x + ": " + result); // Output: Square root of 4: 2

        x = 8;
        result = n69.mySqrt(x);
        System.out.println("Square root of " + x + ": " + result); // Output: Square root of 8: 2

        x = 16;
        result = n69.mySqrt(x);
        System.out.println("Square root of " + x + ": " + result); // Output: Square root of 16: 4
    }

}
