class Solution {
    public boolean isPalindrome(String s) {
        int[] check;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
}