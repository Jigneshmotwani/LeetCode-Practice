class Solution {
    public String toLowerCase(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (65 <= (int) s.charAt(i) && (int) s.charAt(i) <= 90) {
                int t = (int) s.charAt(i) + 32;
                sb.append((char) t);
            } else {
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        return s;
    }
}