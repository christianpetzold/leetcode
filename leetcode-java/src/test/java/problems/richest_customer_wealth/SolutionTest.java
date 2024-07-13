package problems.richest_customer_wealth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leetcodeCase1() {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int expectedMaxWealth = 6;

        assertEquals(expectedMaxWealth, Solution.maximumWealth(accounts));
    }

    @Test
    void leetcodeCase2() {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int expectedMaxWealth = 10;

        assertEquals(expectedMaxWealth, Solution.maximumWealth(accounts));
    }

    @Test
    void leetcodeCase3() {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int expectedMaxWealth = 17;

        assertEquals(expectedMaxWealth, Solution.maximumWealth(accounts));
    }
}