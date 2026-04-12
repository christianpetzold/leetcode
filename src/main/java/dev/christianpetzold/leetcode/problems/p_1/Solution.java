package dev.christianpetzold.leetcode.problems.p_1;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/two-sum">LeetCode Link</a>
 */
public class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, List<Integer>> numIndexes = IntStream
        .range(0, nums.length)
        .boxed()
        .collect(groupingBy(
            i -> nums[i],
            HashMap::new,
            Collectors.toCollection(ArrayList::new)
        ));

    return numIndexes.entrySet().stream()
        .filter(el -> {
          int a = el.getKey();
          int b = target - a;
          boolean diffNumMatch = a != b && numIndexes.containsKey(b);
          boolean sameNumMatch = a == b && el.getValue().size() == 2;
          return diffNumMatch || sameNumMatch;
        })
        .map(Entry::getValue)
        .flatMap(Collection::stream)
        .mapToInt(i -> i)
        .sorted()
        .toArray();
  }
}
