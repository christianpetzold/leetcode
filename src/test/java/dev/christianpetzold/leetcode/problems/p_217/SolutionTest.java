package dev.christianpetzold.leetcode.problems.p_217;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  void shouldDetectDuplicate(){
    int[] nums = new int[]{1,2,3,1};
    assertTrue(solution.containsDuplicate(nums));
  }

  @Test
  void shouldDetectNoDuplicate(){
    int[] nums = new int[] {1, 2, 3, 4};
    assertFalse(solution.containsDuplicate(nums));
  }
}
