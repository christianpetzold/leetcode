package dev.christianpetzold.leetcode.problems.p_347;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/** <a href="https://leetcode.com/problems/top-k-frequent-elements/">LeetCode Link</a> */
public class Solution {
  public int[] topKFrequentBasic(int[] nums, int k) {
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Entry::getKey)
        .toArray();
  }

  public int[] topKFrequentFancy(int[] nums, int k) {
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
        .entrySet()
        .stream()
        .collect(topKByFrequency(k));
  }

  private Collector<Map.Entry<Integer, Long>, ?, int[]> topKByFrequency(int k){
    return Collector.of(
        () -> new PriorityQueue<Entry<Integer, Long>>(Entry.comparingByValue()),
        (heap, entry) -> {
          heap.offer(entry);
          if (heap.size() > k) {
            heap.poll();
          }
        },
        (left, right) -> {
          right.forEach(entry -> {
            left.offer(entry);
            if(left.size() > k) {
              left.poll();
            }
          });
          return left;
        },
        heap -> heap.stream()
            .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
            .mapToInt(Entry::getKey)
            .toArray()
    );
  }
}
