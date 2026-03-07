package palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        final String s = String.valueOf(x);

        int toR = 0;
        int toL = s.length() - 1;
        while (toR <= toL) {
            if (s.charAt(toR) != s.charAt(toL)) {
                return false;
            }
            ++toR;
            --toL;
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        final int factor = 10;
        if (x < 0 || (x % factor == 0 && x != 0)) {
            return false;
        }

        if (x < factor) {
            return true;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * factor + x % factor;
            x /= factor;
        }
        return x == revertedNumber || x == revertedNumber / factor;
    }
}
