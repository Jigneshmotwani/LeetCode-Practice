import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (Character c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (Character c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        List<Integer> word1FrequencyList = new ArrayList<>(map1.values());
        List<Integer> word2FrequencyList = new ArrayList<>(map2.values());
        Collections.sort(word1FrequencyList);
        Collections.sort(word2FrequencyList);
        return word1FrequencyList.equals(word2FrequencyList);


    }
}