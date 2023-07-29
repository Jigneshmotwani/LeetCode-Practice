class Solution {
    public boolean isValid(String s) {

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '[') {
                count1 += 1;
            } else if (s.charAt(i) == ']') {
                count1 -= 1;
            } else if (s.charAt(i) == '{') {
                count2 += 1;
            } else if (s.charAt(i) == '}') {
                count2 -= 1;
            } else if (s.charAt(i) == '(') {
                count3 += 1;
            } else if (s.charAt(i) == ')') {
                count3 -= 1;
            }
        }
        if (count1 == 0 && count2 == 0 && count3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}