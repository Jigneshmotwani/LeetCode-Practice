class Solution {
    public String mergeAlternately(String word1, String word2) {

        int l1 = word1.length();
        int l2 = word2.length();
        String result = "";

        int i = 0;
        int j = 0;
        while(i<l1 && j<l2){
            result += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(j));
            i++;
            j++;
        }
        while(i<l1){
            result += String.valueOf(word1.charAt(i));
            i++;
        }
        while(j<l2){
            result += String.valueOf(word2.charAt(j));
            j++;
        }
        return result;

        
    }
}