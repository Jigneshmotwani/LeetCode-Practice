class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        Integer c = null;

        for(int num: nums){
            if (count == 0){
                c = num;
            }
            if(num == c){
                count += 1;
            } else{
                count -= 1;
            }
        }

        return c;
        
    }
}