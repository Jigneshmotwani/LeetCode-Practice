class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int count = 1;
        for(int i = 1; i<n; i++){

            if(nums[i] == nums[i-1]){
                count += 1;
                if (count > 2){
                    this.remelement(nums, i);
                    i--;
                    n--;
                }
            } else{
                count = 1;
            }
        }
        return n;
    }

    public int[] remelement(int[] arr, int index){
        for(int i = index+1;i<arr.length;i++){
            arr[i-1] = arr[i];

        }
        return arr;
    }
}