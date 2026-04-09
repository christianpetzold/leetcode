package dev.christianpetzold.leetcode.problems.p_3653;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class SolutionTest {

  Solution solution = new Solution();

  static Stream<Arguments> calcXOrAfterQueriesCases() {
    return Stream.of(
//        Arguments.of(new int[] {1, 1, 1}, new int[][] {{0, 2, 1, 4}}, 4),
//        Arguments.of(new int[] {2, 3, 1, 5, 4}, new int[][] {{1, 4, 2, 3}, {0, 2, 1, 2}}, 31),
        Arguments.of(new int[] {780}, new int[][] {{0, 0, 1, 13}, {0, 0, 1, 17}, {0, 0, 1, 9}, {0, 0, 1, 18}, {0, 0, 1, 16}, {0, 0, 1, 6}, {0, 0, 1, 4}, {0, 0, 1, 11}, {0, 0, 1, 7}, {0, 0, 1, 18}, {0, 0, 1, 8}, {0, 0, 1, 15}, {0, 0, 1, 12}}, 523618060)
        );
  }

  static Stream<Arguments> calcQueriesCases() {
    return Stream.of(
        Arguments.of(new int[] {1, 1, 1}, new int[][] {{0, 2, 1, 4}}, new int[]{4,4,4}),
        Arguments.of(new int[] {2, 3, 1, 5, 4}, new int[][] {{1, 4, 2, 3}, {0, 2, 1, 2}}, new int[]{4,18,2,15,4})
        );
  }

  static Stream<Arguments> calcXOrCases() {
    return Stream.of(
        Arguments.of(new int[][] {{0, 1}, {1, 0}}, new int[] {1, 1}),
        Arguments.of(new int[][] {{1, 0, 1}, {0, 1, 0}, {1, 1, 0}}, new int[] {0, 0, 1}), // XOR of 101, 010 and 110 is 001
        Arguments.of(new int[][] {{0}, {0}, {0}}, new int[] {0}), // XOR of three zeros is zero
        Arguments.of(new int[][] {{1}, {1}, {1}}, new int[] {1}),
        Arguments.of(new int[][] {{1, 0}, {1, 0}, {1, 0}}, new int[] {1, 0}),
        Arguments.of(new int[][] {{1,0,0}, {1,0,0,1,0}, {1,0}, {1,1,1,1}, {1,0,0}}, new int[] {1,1,1,1,1})
    );
  }

  static Stream<Arguments> binaryToIntCases() {
    return Stream.of(
        Arguments.of(new int[] {0}, 0),                    // Single 0
        Arguments.of(new int[] {1}, 1),                    // Single 1
        Arguments.of(new int[] {1,0}, 2),                  // 10 binary = 2 decimal
        Arguments.of(new int[] {0,1,0}, 2),                // 010 binary = 2 decimal
        Arguments.of(new int[] {0,1,1}, 3),                // 011 binary = 3 decimal
        Arguments.of(new int[] {1,1,1}, 7),                // 111 binary = 7 decimal
        Arguments.of(new int[] {1,0,0,0}, 8),              // 1000 binary = 8 decimal
        Arguments.of(new int[] {1,1,0,1}, 13),             // 1101 binary = 13 decimal
        Arguments.of(new int[] {1,0,1,0,1,0}, 42),         // 101010 binary = 42 decimal
        Arguments.of(new int[] {1,1,1,1,1,1,1,1}, 255)     // 11111111 binary = 255 decimal
    );
  }

  static Stream<Arguments> intToBinaryCases() {
    return Stream.of(
        Arguments.of(0, new int[] {0}),                    // 0 decimal = 0 binary
        Arguments.of(1, new int[] {1}),                    // 1 decimal = 1 binary
        Arguments.of(2, new int[] {1,0}),                  // 2 decimal = 10 binary
        Arguments.of(3, new int[] {1,1}),                  // 3 decimal = 11 binary
        Arguments.of(4, new int[] {1,0,0}),                // 4 decimal = 100 binary
        Arguments.of(5, new int[] {1,0,1}),                // 5 decimal = 101 binary
        Arguments.of(6, new int[] {1,1,0}),                // 6 decimal = 110 binary
        Arguments.of(7, new int[] {1,1,1}),                // 7 decimal = 111 binary
        Arguments.of(8, new int[] {1,0,0,0}),              // 8 decimal = 1000 binary
        Arguments.of(13, new int[] {1,1,0,1}),             // 13 decimal = 1101 binary
        Arguments.of(42, new int[] {1,0,1,0,1,0}),         // 42 decimal = 101010 binary
        Arguments.of(255, new int[] {1,1,1,1,1,1,1,1})     // 255 decimal = 11111111 binary
    );
  }

  @ParameterizedTest
  @MethodSource("calcXOrAfterQueriesCases")
  void calcXOrAfterQueriesTestMethod(int[] givenNums, int[][] givenQueries, int expected) {
    assertEquals(expected, solution.xOrAfterQueries(givenNums, givenQueries));
  }

  @ParameterizedTest
  @MethodSource("calcXOrCases")
  void calcXOrTestMethod(int[][] givenBinaryValues, int[] expected) {assertArrayEquals(expected, solution.calcXOr(givenBinaryValues));
  }

  @ParameterizedTest
  @MethodSource("intToBinaryCases")
  void intToBinaryTestMethod(int givenNum, int[] expected){
    assertArrayEquals(expected, solution.intToBinary(givenNum));
  }

  @ParameterizedTest
  @MethodSource("binaryToIntCases")
  void intToBinaryTestMethod(int[] binaryValues, int expected){
    assertEquals(expected, solution.binaryToInt(binaryValues));
  }

  @ParameterizedTest
  @MethodSource("calcQueriesCases")
  void calcQueriesTestMethod(int[] givenNums, int[][] givenQueries, int[] expected) {
    assertArrayEquals(expected, solution.calcQueries(givenNums, givenQueries));
  }
}

