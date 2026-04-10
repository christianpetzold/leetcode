package dev.christianpetzold.leetcode.problems.p_3740;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalPractice {
  public List<Integer> getIndicesFromList(int[] nums){
    return IntStream.range(0, nums.length).boxed().toList();
  }

  public List<String> getIndicesNumPairs(int[] nums){
    return IntStream.range(0, nums.length)
        .mapToObj(i -> i + ":" + nums[i])
        .toList();
  }

  public Map<Integer, List<Integer>> getNumOccurrenceIndices(int[] nums){
    return IntStream.range(0, nums.length)
        .boxed()
        .collect(Collectors.groupingBy(i -> nums[i]));
  }

  public Map<Integer, List<Integer>> getIndicesOfNumsWithMinimumOccurence(int[] nums, int minOccurence){
    return getNumOccurrenceIndices(nums).entrySet().stream()
        .filter(el -> el.getValue().size() >= minOccurence)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
  }
}
