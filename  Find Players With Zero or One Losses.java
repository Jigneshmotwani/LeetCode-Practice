import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < matches.length; i++) {
            map.put(matches[i][0], map.getOrDefault(matches[i][0], 0));
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> r1 = new ArrayList<Integer>();
        List<Integer> r2 = new ArrayList<Integer>();
        

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                r1.add(entry.getKey());
            } else if (entry.getValue() == 1) {
                r2.add(entry.getKey());
            }

        }
        Collections.sort(r1);
        Collections.sort(r2);
        result.add(r1);
        result.add(r2);
        return result;
        
    }
}