package stringtointegeratoi;

final public class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        final int factor = 10;

        long ret = 0;
        int startAt = 0;
        char sign = '+';
        final char first = s.charAt(0);
        if (first == '-' || first == '+') {
            startAt = 1;
            sign = first;
        }
        for (int i = startAt; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if ('a' <= c && c <= 'z') {
                return (int) ret;
            }
            if ('A' <= c && c <= 'Z') {
                return (int) ret;
            }
            int last = c - '0';
            if (0 > last) {
                return (int) ret;
            }
            if (sign == '-') {
                last = '0' - c;
            }
            ret = ret * factor + last;
            if (ret > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (ret < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) ret;
    }

    public int myAtoi2(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        long res = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i++) - '0');

            if (res * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (res * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (res * sign);
    }
}
