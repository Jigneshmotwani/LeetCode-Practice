import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int t = 0;
        int l = nums.length;
        while (t!=l) {
            int start = nums[t];
            int end = nums[t];
            while (t+1<l && end+1 == nums[t+1]){
                end = end+1;
                t+=1;
            }
            if(start==end){
                result.add(Integer.toString(start));
            } else{
                result.add(Integer.toString(start)+"->"+Integer.toString(end));
            }
            t+=1;


        }
        return result;
        
    }
}