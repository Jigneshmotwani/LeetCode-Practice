class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int result = 0;
        int[] updated_arr = new int[arr.length + (2*k)-2];
        int i = 0;
        while (i < k - 1) {
            updated_arr[i] = 0;
            i++;
        }
        while (i < arr.length + k - 1) {
            updated_arr[i] = arr[i - k + 1];
            i++;
        }
        while (i < updated_arr.length) {
            updated_arr[i] = 0;
            i++;
        }
        for (int j = 0; j < updated_arr.length; j++) {
            System.out.println(updated_arr[j]);
        }
        for (int j = 0; j < arr.length; j++) {
            int m = 0;
            for (int l = j; l < k; l++) {
                m = Math.max(m, updated_arr[l]);
            }
            
            result += m;
        }
        return result;
    }
}