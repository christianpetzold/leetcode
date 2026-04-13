package dev.christianpetzold.leetcode.problems.p_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/group-anagrams/">LeetCode Link</a>
 */
public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    return new ArrayList<>(Arrays.stream(strs)
        .map(s ->
            Map.entry(
                s.toLowerCase().chars().sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                        StringBuilder::append).toString(),
                s)
        )
        .collect(Collectors.groupingBy(Map.Entry::getKey, HashMap::new,
            Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
        .values());
  }
}