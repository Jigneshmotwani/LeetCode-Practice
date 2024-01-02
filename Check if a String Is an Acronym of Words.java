import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i = 0;i<words.size();i++){
            s1.append(words.get(i).charAt(0));
        }
        String s2 = s1.toString();
        return s2.equals(s);
    }

}