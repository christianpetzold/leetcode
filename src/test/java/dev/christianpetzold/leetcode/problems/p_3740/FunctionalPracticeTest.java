package dev.christianpetzold.leetcode.problems.p_3740;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class FunctionalPracticeTest {
  FunctionalPractice practice = new FunctionalPractice();

  @Test
  void shouldGetIndicesFromList() {
    int[] nums = {1,2,3,4};
    List<Integer> expected = List.of(0,1,2,3);
    assertEquals(expected, practice.getIndicesFromList(nums));
  }

  @Test
  void shouldReturnCorrectIndicesAndNumPairs() {
    int[] nums = {1,2,3,4};
    List<String> expected = List.of("0:1", "1:2", "2:3", "3:4");
    assertEquals(expected, practice.getIndicesNumPairs(nums));
  }

  @Test
  void shouldReturnNumOccurrenceIndices() {
    int[] nums = {7,2,7,7};
    Map<Integer, List<Integer>> expected = Map.of(
        2, List.of(1), 7, List.of(0,2,3)
    );
    assertEquals(expected, practice.getNumOccurrenceIndices(nums));
  }

  @Test
  void shouldReturnNumOccurrenceIndicesWithMinimumOccurence() {
    int[] nums = {7,2,7,7};
    Map<Integer, List<Integer>> expected = Map.of(
        7, List.of(0,2,3)
    );
    assertEquals(expected, practice.getIndicesOfNumsWithMinimumOccurence(nums, 3));
  }


}
