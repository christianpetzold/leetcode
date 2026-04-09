package dev.christianpetzold.leetcode.problems.p_3653;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/xor-after-range-multiplication-queries-i">LeetCode Link</a>
 */

public class Solution {
  public int xOrAfterQueries(int[] nums, int[][] queries) {
    int[] afterQueries = calcQueries(nums, queries);
    int[][] binaryValues = intToBinary(afterQueries);
    int[] xOr = calcXOr(binaryValues);
    return binaryToInt(xOr);
  }

  public int[] calcXOr(int[][] binaryValues){
    int biggestBinarySize = 0;
    for (int[] binaryValue : binaryValues) {
      biggestBinarySize = Math.max(biggestBinarySize, binaryValue.length);
    }
    int [] countOnes = new int[biggestBinarySize];
    for (int[] binaryValue : binaryValues) {
      for(int i = 0; i < binaryValue.length; i++) {
        int lengthDiff = countOnes.length - binaryValue.length;
        if (binaryValue[i] == 1) {
          countOnes[i + lengthDiff]++;
        }
      }
    }
    int [] xOr = new int[countOnes.length];
    for(int i = 0; i < xOr.length; i++){
      xOr[i] = countOnes[i] % 2;
    }
    return xOr;
  }

  public int binaryToInt(int[] binary){
    int num = 0;
    int mult = 1;
    for(int i = binary.length-1; i >= 0; i--){
      num += binary[i] * mult;
      mult*=2;
    }
    return num;
  }

  public int[][] intToBinary(int[] nums){
    int[][] binaryValues = new int[nums.length][35];
    for(int i = 0; i < nums.length; i++) {
      binaryValues[i] = intToBinary(nums[i]);
    }
    return binaryValues;
  }

  public int[] intToBinary(int num){
    if (num == 0) return new int[]{0};

    int[] binaryValue = new int[35];
    int id = 0;
    int temp = num;
    while (temp > 0){
      binaryValue[id++] = temp % 2;
      temp = temp / 2;
    }
    // reverse array
    for(int i = 0; i < id/2; i++){
      int tempVal = binaryValue[i];
      binaryValue[i] = binaryValue[id-1-i];
      binaryValue[id-1-i] = tempVal;
    }

    // remove trailing zeros
    return Arrays.copyOfRange(binaryValue, 0, id);
  }

  public int[] calcQueries(int[] nums, int[][] queries) {
    for (int[] query : queries) {
      for (int j = query[0]; j <= query[1]; j += query[2]) {
        nums[j] = (int) (((long) nums[j] * query[3]) % (((int) Math.pow(10, 9)) + 7));
      }
    }
    return nums;
  }
}
