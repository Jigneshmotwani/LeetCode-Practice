class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int l = digits.length;
        int[] result = new int[l];
        for(int i = l-1; i>=0; i--){
            int y = digits[i] + carry;
            result[i] = y%10;
            carry = y/10;
        }
        if (carry == 1){
            result = new int[l+1];
            result[0] = 1;
        }
        return result;
    }
}