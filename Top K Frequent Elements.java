import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int l = nums.length;

        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

        for (int i = 0; i < l; i++) {
            Integer t = nums[i];
            if (hs.containsKey(t)) {
                Integer x = hs.get(t) + 1;
                hs.remove(t);
                hs.put(t, x);
            } else {
                hs.put(t, 1);
            }

        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );

        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll().getKey();
        }

        return result;

        

        
    }
}