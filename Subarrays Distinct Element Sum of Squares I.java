import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                List<Integer> sum = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    sum.add(nums.get(k).intValue());
                }
                ans += count(sum);

            }
        }
        return ans;
    }

    public int count(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            map.put(nums.get(i).intValue(), map.getOrDefault(nums.get(i).intValue(), 0) + 1);
        }
        return map.size() * map.size();
    }
}