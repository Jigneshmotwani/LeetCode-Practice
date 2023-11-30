import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int l = result.size();
                result.add(result.get(l - 1) + result.get(l - 2));
            } else if (operations[i].equals("D")) {
                int l = result.size();
                result.add(result.get(l - 1) * 2);
            } else if (operations[i].equals("C")) {
                int l = result.size();
                result.remove(l - 1);
            } else {
                result.add(Integer.valueOf(operations[i]));
            }
        }
        int ans = 0;
        for (int i = 0; i < result.size(); i++) {
            ans += result.get(i);
        }
        return ans;
    }
}