class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0; // Special case for x = 0
        }
        
        long low = 1;
        long high = x;
        long ans = 0; // Initialize to 0 to avoid uninitialized variable issue

        while (low <= high) {
            long mid = low + (high - low) / 2; // Prevent overflow by calculating mid this way

            if (mid * mid <= x) { // Check if mid is a perfect square or less
                ans = mid;
                low = mid + 1; // Search for a higher perfect square closer to x
            } else {
                high = mid - 1; // Search for a lower perfect square closer to x
            }
        }

        return (int) ans; // Cast the long result back to int (may lose precision)
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 16; // Example value
        System.out.println("Square root of " + x + " is: " + solution.mySqrt(x));
    }
}
