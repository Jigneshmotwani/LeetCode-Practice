class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int l = strs.length;
        String result = "";

        String s = strs[0];
        for (int i = 0; i < s.length(); i++) {

            boolean b = true;
            for (int j = 1; j < l; j++) {
                if (strs[j].length() <= i || s.charAt(i) != strs[j].charAt(i)) {
                    b = false;
                    break;
                }
            }
            if (!b) {
                break;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}