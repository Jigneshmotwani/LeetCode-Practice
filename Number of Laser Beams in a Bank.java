import java.util.*;
class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> b = new ArrayList<>();
        for(int i = 0;i<bank.length;i++){
            int t = count(bank[i]);
            if(t!=0){
                b.add(t);
            }
        }
        int ans = 0;
        for(int i = 1; i<b.size();i++){
            ans += b.get(i)*b.get(i-1);
        }
        return ans;
    }
    public int count(String s){
        int c = 0;
        for(char k : s.toCharArray()) 
            c += k - '0';
        System.out.println(c);
        return c;
    }
}