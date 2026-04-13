package dev.christianpetzold.leetcode.problems.p_49;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  Solution solution = new Solution();

 static Stream<Arguments> provideGroupAnagramsTestData() {
    return Stream.of(
        Arguments.of(
            new String[]{"act", "pots", "tops", "cat", "stop", "hat"},
            List.of(
                List.of("act", "cat"),
                List.of("pots", "stop", "tops"),
                List.of("hat")
            )
        ));
  }

  @ParameterizedTest
  @MethodSource("provideGroupAnagramsTestData")
  void groupAnagrams_1(String[] input, List<List<String>> expected) {
   var actual = solution.groupAnagrams(input);
   var expectedSorted = expected.stream().map(li -> li.stream().sorted().toList()).toList();
   var actualSorted = actual.stream().map(li -> li.stream().sorted().toList()).toList();
   assertEquals(expected.size(), actual.size());
   assertTrue(expectedSorted.containsAll(actualSorted));
}
}