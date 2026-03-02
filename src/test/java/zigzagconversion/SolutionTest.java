package zigzagconversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convert() {
        final Solution solution = new Solution();
        Assertions.assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        Assertions.assertEquals("PAHNAPLSIIGYIR", solution.convert2("PAYPALISHIRING", 3));
        Assertions.assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        Assertions.assertEquals("PINALSIGYAHRPI", solution.convert2("PAYPALISHIRING", 4));
    }
}