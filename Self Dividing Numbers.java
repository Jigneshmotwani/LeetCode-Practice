import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if(isSelfDividing(right)){
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSelfDividing(int n) {
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

}