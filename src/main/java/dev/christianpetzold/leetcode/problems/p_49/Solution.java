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
  public List<List<String>> groupAnagramsBySorting(String[] strs) {
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

  public List<List<String>> groupAnagramsByOccurence(String[] strs) {
    return new ArrayList<>(Arrays.stream(strs)
        .map(s -> Map.entry(
            s, getLetterFrequencyString(s))
        )
        .collect(Collectors.groupingBy(Map.Entry::getValue, HashMap::new,
            Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
        .values());
  }

  private String getLetterFrequencyString(String s){
    int[] freq = new int[26];
    s.toLowerCase().chars().forEach(c -> freq[c - 'a']++);
    return Arrays.toString(freq);
  }
}