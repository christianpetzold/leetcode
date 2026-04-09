package dev.christianpetzold.leetcode.problems.p_242;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  void isAnagram() {
    String s1 = "carrace";
    String s2 = "racecar";
    assertTrue(solution.isAnagram(s1, s2));
    assertTrue(solution.isAnagramFunctional(s1, s2));
  }

  @Test
  void isNotAnagram() {
    String s1 = "hello";
    String s2 = "world";
    assertFalse(solution.isAnagram(s1, s2));
    assertFalse(solution.isAnagramFunctional(s1, s2));
  }
}
