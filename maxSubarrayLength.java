import java.util.HashMap;

class Sol {

    public static int maxSubarrayLength(int[] nums, int k) {
        int left = 0, right = 0, ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (left < nums.length && right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(left) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3, 1, 2, 3, 4};
        int k = 2;

        int maxLength = maxSubarrayLength(nums, k);
        System.out.println("Maximum subarray length with at most " + k + " distinct elements: " + maxLength);
    }
}
