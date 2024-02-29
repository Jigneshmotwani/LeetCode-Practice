class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Character ans = null;
        for (int i = 0; i < letters.length; i++) {
            if ((int) letters[i] - (int) target > 0) {
                if (ans == null) {
                    ans = letters[i];
                } else {
                    if ((int) letters[i] - (int) target < (int) ans - (int) target) {
                        ans = letters[i];
                    }
                }
            }
        }
        if (ans == null) {
            return letters[0];
        } else {
            return ans;
        }
    }
}