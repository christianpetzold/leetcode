package problems.running_sum_of_1d_array;

/**
 * @see <a href="https://leetcode.com/problems/running-sum-of-1d-array/submissions/">Problem Link</a>
 */
public class Solution {

    // time complexity: O(n)
    // space complexity: O(1)
    public static int[] runningSumCounter(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < runningSum.length; i++) {
            runningSum[i] = sum + nums[i];
            sum += nums[i];
        }

        return runningSum;
    }

    // time complexity: O(n)
    // space complexity: O(1)
    public static int[] runningSumNoCounter(int[] nums) {
        int[] runningSum = new int[nums.length];

        if (nums.length > 1) {
            runningSum[0] = nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    // time complexity: O(n)
    // space complexity: O(1)
    public static int[] runningSumInPlace(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
