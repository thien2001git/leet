package zigzagconversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class SolutionTest {

    @Test
    void convert() {
        final Solution solution = new Solution();

        // Define test cases: {Input String, NumRows, Expected Output}
        final Object[][] cases = {
                {"PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"},
                {"PAYPALISHIRING", 4, "PINALSIGYAHRPI"},
                {"PAYP", 4, "PAYP"},
                {"PAY", 4, "PAY"},
                {"PAY", 1, "PAY"},
        };

        for (final Object[] test : cases) {
            final String input = (String) test[0];
            final int rows = (int) test[1];
            final String expected = (String) test[2];

            Assertions.assertEquals(expected, solution.convert(input, rows));
            Assertions.assertEquals(expected, solution.convert2(input, rows));
        }
    }
}