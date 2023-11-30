
import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {

        System.out.println(t.length());
        System.err.println(s.length());

        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
        for(int i = 0; i<t.length();i++){
            frequency.put(t.charAt(i),0);
        }
        System.out.println(frequency);

        for(int i = 0; i<t.length();i++){
            int temp = frequency.get(t.charAt(i));
            frequency.remove(t.charAt(i));
            frequency.put(t.charAt(i), temp+1);
        }
        System.out.println(frequency);
        
        for(int i = 0;i<s.length();i++){
            int temp = frequency.get(s.charAt(i));
            frequency.remove(s.charAt(i));
            frequency.put(s.charAt(i), temp-1);
        }
        System.out.println(frequency);

        for(int i = 0;i<t.length();i++){
            if(frequency.get(t.charAt(i))!=0){
                return t.charAt(i);
            }
        }
        System.out.println(frequency);

        return 'a';
        
    }
}