package palindromenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void isPalindrome() {
        final Solution solution = new Solution();

        // Define test cases: {Input String, NumRows, Expected Output}
        final Object[][] cases = {
                {121, true},
        };

        for (final Object[] test : cases) {
            final int input = (int) test[0];
            final boolean expected = (boolean) test[1];
            Assertions.assertEquals(expected, solution.isPalindrome(input));
        }
    }
}