package dev.christianpetzold.leetcode.problems.p_3740;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

 /**
 <a href="https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/">LeetCode Link</a>
  **/
public class Solution {
  public int minimumDistance(int[] nums) {
    return IntStream
        .range(0, nums.length)
        .boxed()
        .collect(groupingBy(
                i -> nums[i],
                HashMap::new,
                Collectors.toCollection(ArrayList::new)
            ))
        .values()
        .stream()
        .filter(list -> list.size() >= 3)
        .flatMapToInt(list ->
            IntStream.range(0, list.size() - 2)
                .map(i -> {
                  int a = list.get(i);
                  int b = list.get(i + 1);
                  int c = list.get(i + 2);
                  return Math.abs(a - b) + Math.abs(a - c) + Math.abs(b - c);
                })
        )
        .min()
        .orElse(-1);
  }
}

