import java.util.Scanner;

class Missing {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Rearrange the array so that nums[i] is i + 1
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the smallest missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers are present, return the next positive integer
        return n + 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scan.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            nums[i] = scan.nextInt();
        }

        int missing = firstMissingPositive(nums);
        System.out.println("The smallest missing positive integer is: " + missing);
    }
}
