class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i = 0;i<nums.length;i++){
            a+= nums[i];
            b+= digitsum(nums[i]);
        }
        
        return a-b;
    }
    public int digitsum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum +  num%10;
            num = num/10;
        }
        System.out.println(sum);
        return sum;
    }
    
}