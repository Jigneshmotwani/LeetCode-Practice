import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> AR = new ArrayList<>();
        for(int i = 0;i<nums.length;i+=2){
            for(int j = 0;j<nums[i];j++){
                AR.add(nums[i+1]);
            }
        }
        int[] result = new int[AR.size()];
        for(int i = 0; i<AR.size();i++){
            result[i] = AR.get(i);
        }
        return result;
    }
}