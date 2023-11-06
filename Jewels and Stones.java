import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> myMap  = new HashMap<Character, Integer>();
        for(int i = 0; i<jewels.length();i++){
            myMap.put(jewels.charAt(i), null);
        }
        int count = 0;
        for(int i = 0; i< stones.length(); i++){
            if(myMap.containsKey(stones.charAt(i))){
                count+=1;
            }
        }
        return count;
        
    }
}