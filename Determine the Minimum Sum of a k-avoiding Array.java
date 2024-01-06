import java.util.*;

class Solution {
    public int minimumSum(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        int current = 1;
        for(int i = 0; i < n; i++){
            boolean found = false;
            while(true){
                for(int j = 0; j < arr.size(); j++){
                    if(arr.get(j) + current == k){
                        current++;
                        found = true;
                        break;
                    }
                }
                if(!found){
                    break;
                }
                found = false;
            }
            arr.add(current);
            current++;
        }
        int ans = 0;
        for(int i = 0; i < arr.size(); i++){
            ans += arr.get(i);
        }
        System.out.println(arr);
        return ans;
    }
}