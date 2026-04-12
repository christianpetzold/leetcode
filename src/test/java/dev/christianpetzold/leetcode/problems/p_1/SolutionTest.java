package dev.christianpetzold.leetcode.problems.p_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  void shouldReturnAddendIndices() {
    int[] nums = {1,2,3,5};
    int target = 6;
    int[] expected = {0,3};
    assertArrayEquals(expected, solution.twoSum(nums, target));
  }

  @Test
  void shouldReturnAddendIndices_1() {
    int[] nums = {4,5,6};
    int target = 10;
    int[] expected = {0,2};
    assertArrayEquals(expected, solution.twoSum(nums, target));
  }

  @Test
  void shouldReturnAddendIndices_2() {
    int[] nums = {5,5,1};
    int target = 10;
    int[] expected = {0,1};
    assertArrayEquals(expected, solution.twoSum(nums, target));
  }
}
