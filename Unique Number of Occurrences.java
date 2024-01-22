import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        Collections.sort(result);
        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i).equals(result.get(i + 1))) {
                return false;
            }

        }
        return true;
    }
}