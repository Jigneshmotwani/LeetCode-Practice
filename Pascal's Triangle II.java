import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++){
            int temp = binomialCoefficient(rowIndex, i);
            result.add(temp);
        }
        return result;
    }

    public int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (k > n - k) {
            k = n - k;
        }
        int res = 1;
        for (int i = 0; i < k; i++) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }
}