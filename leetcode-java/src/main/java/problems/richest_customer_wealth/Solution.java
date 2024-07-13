package problems.richest_customer_wealth;

public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int totalWealthOfAccount = 0;
            for (int i : account) {
                totalWealthOfAccount += i;
            }
            maxWealth = Math.max(maxWealth, totalWealthOfAccount);
        }
        return maxWealth;
    }
}
