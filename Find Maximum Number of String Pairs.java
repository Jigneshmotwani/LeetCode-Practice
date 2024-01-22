import java.util.HashMap;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String, String> map = new HashMap<String, String>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            sb.reverse();
            if(map.containsKey(sb.toString())) {
                count++;
            }
            map.put(words[i], sb.toString());
        }
        return count;
    }
}