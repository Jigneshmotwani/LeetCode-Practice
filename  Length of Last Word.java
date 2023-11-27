class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) {
            return s.length();
        }
        int l = s.length();
        int result = 0;

        int i = l - 1;
        while (s.charAt(i) == ' ') {
            i = i - 1;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            i = i - 1;
            result = result + 1;
        }
        return result;

    }
}