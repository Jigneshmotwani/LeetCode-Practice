class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        
        int steps = 0;
        for (int i : count) {
            if (i > 0) {
                steps += i;
            }
        }
        
        return steps;
    }
}