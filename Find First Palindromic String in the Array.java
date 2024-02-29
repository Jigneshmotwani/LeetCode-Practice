class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPal(word)) {
                return word;
            }
        }
        return "";
    }
    
    public boolean isPal(String word) {
        int n = word.length();
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }
}