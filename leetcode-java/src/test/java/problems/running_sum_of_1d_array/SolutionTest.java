package problems.running_sum_of_1d_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    @Test
    void leetcodeCase1() {
        int[] nums = {1, 2, 3, 4};
        int[] expectedRunningSum = {1, 3, 6, 10};
        assert Arrays.equals(expectedRunningSum, Solution.runningSumNoCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumInPlace(nums));
    }

    @Test
    void leetcodeCase2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] expectedRunningSum = {1, 2, 3, 4, 5};
        assert Arrays.equals(expectedRunningSum, Solution.runningSumCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumNoCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumInPlace(nums));
    }

    @Test
    void leetcodeCase3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] expectedRunningSum = {3, 4, 6, 16, 17};
        assert Arrays.equals(expectedRunningSum, Solution.runningSumCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumNoCounter(nums));
        assert Arrays.equals(expectedRunningSum, Solution.runningSumInPlace(nums));
    }
}