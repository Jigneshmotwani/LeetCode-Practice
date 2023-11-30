import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int highest = 0;
        for(int i =0;i<n;i++){
            if(candies[i]>highest){
                highest = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<Boolean>();
        for(int i = 0;i<n;i++){
            if(candies[i]+extraCandies>=highest){
                result.add(true)
;            } else{
                result.add(false);
            }
        }
        return result;
    }
}