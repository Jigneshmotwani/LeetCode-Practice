class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] mapping = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    mapping[i] = j;
                }
            }
        }
        return mapping;
    }
    
}