package reverseinteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class SolutionTest {

    @Test
    void reverse() {
        final Solution solution = new Solution();
        final int[][] testCases = {
                {123, 321},
                {-123, -321},
                {120, 21},
                {1534236469, 0},
                {-2147483648, 0}
        };

        for (final int[] test : testCases) {
            int input = test[0];
            int expected = test[1];

            Assertions.assertEquals(expected, solution.reverse(input), "Failed on reverse() with input: " + input);
            Assertions.assertEquals(expected, solution.reverse2(input), "Failed on reverse2() with input: " + input);
        }
    }
}