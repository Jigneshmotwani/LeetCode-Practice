import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        boolean y = true;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int z = x;
        while (y == true) {
            int a;

            a = z % 10;
            z = (z - a) / 10;
            arr.add(a);
            if (z == 0) {
                y = false;
            }
        }
        int l = arr.size();
        for (int i = 0; i < l / 2; i++) {
            if (arr.get(i) != arr.get(l - 1 - i)) {
                ans = false;
            }

        }
        return ans;

    }
}
// can convert to string and then use charat()