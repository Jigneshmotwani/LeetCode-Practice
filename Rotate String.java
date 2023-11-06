class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        for(int i =0; i<goal.length();i++){
            String temp = goal.substring(i, goal.length()) + goal.substring(0, i);
            System.out.println(temp);
            if(s== temp){
                return true;
            }
        }
        return false;
    }
}