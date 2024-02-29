import java.util.Arrays;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];
        Pair[] pairs = new Pair[n];

        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(intervals[i][0], i);
        }

        Arrays.sort(pairs, (a, b) -> a.val - b.val);

        for (int i = 0; i < n; i++) {
            int target = intervals[i][1];
            int l = 0, r = n;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (pairs[mid].val < target) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            res[i] = l == n ? -1 : pairs[l].idx;
        }
        return res;
    }

    class Pair {
        int val, idx;

        Pair(int v, int i) {
            val = v;
            idx = i;
        }
    }
}