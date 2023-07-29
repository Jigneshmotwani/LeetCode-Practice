import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            char[] s1 = s.toCharArray();
            int result = 0;
            int count = 0;
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < s1.length; i++) {
                if (set.contains(s1[i])) {
                    while (set.contains(s1[i])) {
                        set.remove(s1[i - count]);
                        count--;
                    }
                }
                count++;
                set.add(s1[i]);
                if (count > result) {
                    result = count;
                }
            }
            return result;
        }
    }
}
