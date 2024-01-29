import java.util.*;

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            l1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            l2.add(nums2[i]);
        }
        int[] result = new int[2];
        result[0] = find(l1, l2);
        result[1] = find(l2, l1);
        return result;
    }

    public int find(List<Integer> a, List<Integer> b) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                count++;
            }
        }
        return count;
    }
}