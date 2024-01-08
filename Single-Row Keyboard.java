import java.util.HashMap;

class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i), i);
        }
        int current = 0;
        int time = 0;
        for(char c: word.toCharArray()){
            time+=Math.abs(current-map.get(c));
            current = map.get(c);
        }
        return time;
    }
}