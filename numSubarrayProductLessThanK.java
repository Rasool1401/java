class Solutionnn {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int count = 0;
        int prod = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 6};
        int k1 = 100;
        System.out.println(numSubarrayProductLessThanK(nums1, k1)); // Output: 8

        int[] nums2 = {1, 2, 3};
        int k2 = 0;
        System.out.println(numSubarrayProductLessThanK(nums2, k2)); // Output: 0
    }
}
