import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        int i = 0;
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (char c : key.toCharArray()) {
            if (c!= ' ' && !map.containsKey(c)) {
                map.put(c, alphabets.charAt(i));
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else {
                sb.append(map.get(c));
            }
        }
        return sb.toString();

        
    }
}