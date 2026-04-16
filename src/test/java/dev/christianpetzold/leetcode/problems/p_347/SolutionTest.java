package dev.christianpetzold.leetcode.problems.p_347;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  Solution solution = new Solution();

  static Stream<Arguments> topKFrequentCases() {
    return Stream.of(
        Arguments.of("Neetcode 1",new int[]{1,1,1,2,2,3}, 2, new int[]{1,2}),
        Arguments.of("Neetcode 2",new int[]{7,7}, 1, new int[]{7})
    );
  }

  private void assertTopK(String name, int[] givenNums, int givenK, int[] expected,
      BiFunction<int[], Integer, int[]> solver) {
    int[] actual = solver.apply(givenNums, givenK);

    int[] expectedSorted = Arrays.copyOf(expected, expected.length);
    int[] actualSorted = Arrays.copyOf(actual, actual.length);
    Arrays.sort(expectedSorted);
    Arrays.sort(actualSorted);

    assertArrayEquals(expectedSorted, actualSorted, name);
  }

  @ParameterizedTest
  @MethodSource("topKFrequentCases")
  void topKFrequent_Basic(String name, int[] givenNums, int givenK, int[] expected){
    assertTopK(name, givenNums, givenK, expected, solution::topKFrequentBasic);
  }

  @ParameterizedTest
  @MethodSource("topKFrequentCases")
  void topKFrequent_Fancy(String name, int[] givenNums, int givenK, int[] expected){
    assertTopK(name, givenNums, givenK, expected, solution::topKFrequentFancy);
  }
}
