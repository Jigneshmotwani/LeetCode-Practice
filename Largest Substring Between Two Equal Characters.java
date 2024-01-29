import java.util.*;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.putIfAbsent(c, new ArrayList<>());
            map.get(c).add(i);
        }
        int max = -1;
        for (char c : map.keySet()) {
            ArrayList<Integer> l = map.get(c);
            if (l.size() > 1) {
                int firstIndex = l.get(0);
                int lastIndex = l.get(l.size() - 1);
                max = Math.max(max, lastIndex - firstIndex - 1);
            }
        }
        return max;
    }
}