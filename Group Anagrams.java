import java.util.*;;

class Solution {

    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if (l1 != l2) {
            return false;
        }

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;


    }

    public List<List<String>> groupAnagrams(String[] strs) {


        
        List<String> str = new ArrayList<String>();
        int c = 0;
        for (int i = 0; i < strs.length; i++) {
            str.add(strs[i]);
            c += strs[i].length();
        }

        
        List<List<String>> ans = new ArrayList<List<String>>();

        if (c == 0) {
            
            ans.add(str);
            return ans;
        }

        while (str.size() != 0) {
            
            List<String> Temp = new ArrayList<String>();
            String ss = str.get(0);
            str.remove(0);
            Temp.add(ss);
            for (int i = str.size()-1; i >= 0; i--) {
                if (isAnagram(ss, str.get(i))) {
                    Temp.add(str.get(i));
                    str.remove(i);
                }
            }
            ans.add(0, Temp);
        }



        return ans;
    }
}