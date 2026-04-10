package dev.christianpetzold.leetcode.problems.p_3740;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  void shouldReturnCorrectMinimumDistance_1() {
    int[] nums = {1,2,1,1,3};
    int expected = 6;
    assertEquals(expected, solution.minimumDistance(nums));
  }

  @Test
  void shouldReturnCorrectMinimumDistance_2() {
    int[] nums = {1,1,2,3,2,1,2};
    int expected = 8;
    assertEquals(expected, solution.minimumDistance(nums));
  }

  @Test
  void shouldFailToFindMinimumDistance() {
    int[] nums = {1,2,3};
    int expected = -1;
    assertEquals(expected, solution.minimumDistance(nums));
  }

}

