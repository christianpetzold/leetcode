package dev.christianpetzold.leetcode.problems.p_242;

import java.util.Arrays;

public class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()){
      return false;
    }

    int offset = 'a';
    int[] charOccurrence = new int[26];

    for(int i = 0; i < s.length(); i++) {
      charOccurrence[s.charAt(i)-offset]++;
      charOccurrence[t.charAt(i)-offset]--;
    }

    for (int i : charOccurrence) {
      if (i != 0){
        return false;
      }
    }

    return true;
  }

  public boolean isAnagramFunctional(String s, String t){
    if (s.length() != t.length()) {
      return false;
    }
    return Arrays.equals(
        s.chars().sorted().toArray(),
        t.chars().sorted().toArray());
  }
}
