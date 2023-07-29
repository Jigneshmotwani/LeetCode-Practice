import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if (l1 != l2) {
            return false;
        }

        HashMap<Character, Integer> hs1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hs2 = new HashMap<Character, Integer>();
        for (int i = 0; i < l1; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (hs1.containsKey(c1)) {
                Integer x = hs1.get(c1);
                hs1.remove(c1);
                hs1.put(c1, x + 1);
            } else {
                hs1.put(c1, 1);
            }

            if (hs2.containsKey(c2)) {
                Integer x = hs2.get(c2);
                hs2.remove(c2);
                hs2.put(c2, x + 1);
            } else {
                hs2.put(c2, 1);
            }

        }

        if (hs1.equals(hs2)) {
            return true;
        }
        else {
            return false;
        }

    }
}