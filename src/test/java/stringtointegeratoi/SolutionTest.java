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
                {"1337c0d3", 1337},
                {"0-1", 0},
                {"words and 987", 0},
        };

        for (final Object[] test : cases) {
            String input = (String) test[0];
            int expected = (int) test[1];

            Assertions.assertEquals(expected, solution.myAtoi(input));
            Assertions.assertEquals(expected, solution.myAtoi2(input));
        }
    }
}