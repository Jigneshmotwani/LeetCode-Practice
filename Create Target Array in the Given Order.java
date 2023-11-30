import java.util.ArrayList;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            temp.add(index[i],nums[i]);
        }
        for(int i = 0;i<temp.size();i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}

