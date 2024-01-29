class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        if (numRows >= s.length()) {
            return s;
        }
        int numCols = (s.length() - 1 / 2) + 1;
        char[][] store = new char[numRows][numCols];
        int i = 0;
        int k = 0;
        while (i < s.length()) {
            for (int j = 0; j < numCols / numRows; j++) {
                for (int k1 = 0; k1 < numRows; k1++) {
                    if (i >= s.length()) {
                        break;
                    }
                    store[k1][k] = s.charAt(i);
                    i++;
                }
                k++;
                for (int k2 = numRows - 2; k2 > 0; k2--) {
                    if (i >= s.length()) {
                        break;
                    }
                    store[k2][k] = s.charAt(i);
                    i++;
                    k++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < store.length; a++) {
            for (int b = 0; b < store[0].length; b++) {
                if (store[a][b] != '\u0000') {
                    sb.append(store[a][b]);
                }
            }
        }
        return sb.toString();
    }
}