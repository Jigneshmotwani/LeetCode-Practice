class Solution {
    public String truncateSentence(String s, int k) {
        int i = 0;
        int words = 0;
        while(words<k&&i<s.length()){
            if(s.charAt(i) == ' '){
                words++;
                i++;
            } else{
                i++;
            }
        }
        if(i!=s.length()){
            return s.substring(0,i-1);
    
        } else{
            return s;
        }
    }
}