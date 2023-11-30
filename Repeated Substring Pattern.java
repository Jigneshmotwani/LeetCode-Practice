class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1){
            return false;
        }
        int l = s.length();
        for(int i = 0; i<l/2;i++){
            String temp = s.substring(i+1, l) + s.substring(0, i+1);
            if(temp.equals(s)){
                return true;
            }
        }
        return false;
        
    }
}