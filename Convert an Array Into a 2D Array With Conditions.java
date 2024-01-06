import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            num.add(nums[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        boolean cov = false;
        while(!cov){
            cov = true;
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i<num.size();i++){
                if(temp.contains(num.get(i))){
                    cov = false;
                } else{
                    temp.add(num.get(i));
                    num.remove(i);
                    i--;
                }
            }
            result.add(temp);
        }
        return result;
    }
}