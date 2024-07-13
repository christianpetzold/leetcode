package problems.fizz_buzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    s = "FizzBuzz";
                } else {
                    s = "Buzz";
                }
            } else if (i % 3 == 0) {
                s = "Fizz";
            }

            result.add(s);
        }
        return result;
    }

    public static List<String> fizzBuzzArray(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            result[i - 1] = String.valueOf(i);
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    result[i - 1] = "FizzBuzz";
                } else {
                    result[i - 1] = "Buzz";
                }
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            }
        }
        return Arrays.asList(result);
    }
}
