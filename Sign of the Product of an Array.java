class Solution {
    public int arraySign(int[] nums) {

        int result = 1;
        for (int i =0; i<nums.length;i++){
            if(nums[i]>0){
                result *= 1;
            } else if(nums[i]<0){
                result *= -1;
            } else{
                return 0;
            }
        }

        if(result>0){
            return 1;
        } else if(result<0){
            return -1;
        } else{
            return 0;
        }
        
    }
}