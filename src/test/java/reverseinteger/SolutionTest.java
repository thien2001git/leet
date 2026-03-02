package reverseinteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverse() {
        final Solution solution = new Solution();
        Assertions.assertEquals(321, solution.reverse(123));
        Assertions.assertEquals(-321, solution.reverse(-123));
        Assertions.assertEquals(21, solution.reverse(120));
        Assertions.assertEquals(0, solution.reverse(1534236469));
        Assertions.assertEquals(0, solution.reverse(-2147483648));

        Assertions.assertEquals(321, solution.reverse2(123));
        Assertions.assertEquals(-321, solution.reverse2(-123));
        Assertions.assertEquals(21, solution.reverse2(120));
        Assertions.assertEquals(0, solution.reverse2(1534236469));
        Assertions.assertEquals(0, solution.reverse2(-2147483648));
    }
}