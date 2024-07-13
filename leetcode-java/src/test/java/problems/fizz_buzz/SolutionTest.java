package problems.fizz_buzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leetCodeCase1() {
        List<String> result = List.of("1", "2", "Fizz");
        int num = 3;
        assertEquals(result, Solution.fizzBuzz(num));
        assertEquals(result, Solution.fizzBuzzArray(num));
    }

    @Test
    void leetCodeCase2() {
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz");
        int num = 5;
        assertEquals(result, Solution.fizzBuzz(num));
        assertEquals(result, Solution.fizzBuzzArray(num));
    }

    @Test
    void leetCodeCase3() {
        List<String> result = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        int num = 15;
        assertEquals(result, Solution.fizzBuzz(num));
        assertEquals(result, Solution.fizzBuzzArray(num));
    }
}