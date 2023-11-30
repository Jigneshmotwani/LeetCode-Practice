class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        int h = haystack.length();
        int n = needle.length();

        for(int i=0; i<h-n+1;i++){
            String temp = haystack.substring(i, i+n);
            if(temp.equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}