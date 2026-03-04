package stringtointegeratoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class SolutionTest {

    @Test
    void myAtoi() {
        final Solution solution = new Solution();

        // Define test cases: {Input String, NumRows, Expected Output}
        final Object[][] cases = {
                {"42", 42},
                {"-042", -42},
                {"-042", -42},
                {"+042", 42},
                {"1337c0d3", 1337},
                {"1337 d3", 1337},
                {"0-1", 0},
                {"words and 987", 0},
                {"Aords and 987", 0},
                {"", 0},
                {String.valueOf((long) Integer.MAX_VALUE + 1), Integer.MAX_VALUE},
                {String.valueOf((long) Integer.MIN_VALUE - 1), Integer.MIN_VALUE},
        };

        for (final Object[] test : cases) {
            final String input = (String) test[0];
            final int expected = (int) test[1];
            System.out.println("input " + input);
            System.out.println("expected " + expected);
            Assertions.assertEquals(expected, solution.myAtoi(input));
            Assertions.assertEquals(expected, solution.myAtoi2(input));
        }
    }
}