import java.util.Arrays;
import java.util.Scanner;

class Dumb {
    public long countSubarrays(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int l = 0, r = 0, n = nums.length;

        while (r < n) {
            k -= nums[r] == mx ? 1 : 0;
            r++;
            while (k == 0) {
                k += nums[l] == mx ? 1 : 0;
                l++;
            }
            ans += l;
        }

        return ans;
    }

    public static void main(String[] args) {
        Dumb dumb = new Dumb();

        int[] nums1 = {1, 3, 2, 3, 3};
        int k1 = 2;
        System.out.println(dumb.countSubarrays(nums1, k1)); // Output: 6

        int[] nums2 = {1, 4, 2, 1};
        int k2 = 3;
        System.out.println(dumb.countSubarrays(nums2, k2)); // Output: 0
    }
}
