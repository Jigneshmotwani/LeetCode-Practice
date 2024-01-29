class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] all = allowed.toCharArray();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (!contains(all, c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    private boolean contains(char[] all, char c) {
        for (int i = 0; i < all.length; i++) {
            if (all[i] == c) {
                return true;
            }
        }
        return false;
    }
}