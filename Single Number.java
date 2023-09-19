import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public int singleNumber(int[] nums) {
        Dictionary<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            if(dict.get(nums[i]) == null){
                dict.put(nums[i], 1);
            }else{
                dict.remove(nums[i]);
            }
        }
        return dict.keys().nextElement();
    }
}