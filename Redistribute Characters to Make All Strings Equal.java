import java.util.HashMap;

class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }
        HashMap<Character, Integer> result = new HashMap<>();
        for (String word : words) {
            for (Character c : word.toCharArray()) {
                result.put(c, result.getOrDefault(c, 0) + 1);
            }
        }
        for (Integer freq : result.values()) {
            if (freq % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}