import java.util.HashMap;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String[] str = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        for (int i = 0; i < abc.length(); i++) {
            map.put(abc.charAt(i), str[i]);
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : words[i].toCharArray()) {
                sb.append(map.get(c));
            }
            map2.put(sb.toString(), map2.getOrDefault(sb.toString(), 0));
        }
        return map2.size();

    }
}