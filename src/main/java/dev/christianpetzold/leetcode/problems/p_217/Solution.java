package dev.christianpetzold.leetcode.problems.p_217;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate">LeetCode Link</a>
 */
public class Solution {
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i-1]){
        return true;
      }
    }
    return false;
  }
}
