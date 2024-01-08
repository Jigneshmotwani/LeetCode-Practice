import java.util.Hashtable;
import java.util.LinkedHashMap;

class Solution {
    public int minOperations(int[] nums) {
        LinkedHashMap<Integer,Integer> table = new LinkedHashMap<>();
        for(int num : nums){
            table.put(num, table.getOrDefault(num, 0) + 1);
        }

        int operations = 0;
        for(int count : table.values()){
            while(count != 0){
                if(count >= 5){
                    count -= 3;
                    operations++;
                } else if(count == 4){
                    count -= 2;
                    operations++;
                } else if(count == 3){
                    count -= 3;
                    operations++;
                } else if(count == 2){
                    count -= 2;
                    operations++;
                } else { 
                    return -1;
                }
            }
        }
        return operations;
        
    }
    
}