package zigzagconversion;

public class Solution {
    public String convert(String s, int numRows) {
        final char[][] map = new char[s.length()][numRows];
        boolean isDown = true;
        int row = 0;
        int col = 0;
        for (int i = 0; i < s.length(); i++) {
            map[col][row] = s.charAt(i);
            if (isDown) {
                if (++row == numRows) {
                    row -= 2;
                    ++col;
                    isDown = false;
                }
            } else {
                ++col;
                if (--row == -1) {
                    row = 1;
                    --col;
                    isDown = true;
                }
            }
        }
        final StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < map[0].length; j++) {
            for (char[] chars : map) {
                final char e = chars[j];
                if (e != 0) {
                    stringBuilder.append(e);
                }
            }
        }

        return stringBuilder.toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int currentRow = 0;
        boolean goingDown = false;

        for (final char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        final StringBuilder result = new StringBuilder();
        for (final StringBuilder row : rows) result.append(row);

        return result.toString();
    }
}
