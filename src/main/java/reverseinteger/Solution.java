package reverseinteger;

final class Solution {
    public int reverse(int x) {
        final int factor = 10;

        long rev = 0;
        while (x != 0) {
            final int last = x % factor;
            x /= factor;
            rev = rev * factor + last;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) rev;
    }

    public int reverse2(int x) {
        final int factor = 10;
        int rev = 0;
        while (x != 0) {
            int pop = x % factor;
            x /= factor;

            if (rev > Integer.MAX_VALUE / factor || (rev == Integer.MAX_VALUE / factor && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / factor || (rev == Integer.MIN_VALUE / factor && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }
}
