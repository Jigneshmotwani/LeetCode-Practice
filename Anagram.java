import java.util.Scanner;
import java.util.HashMap;

class Anagram {
    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < A.length(); i++) {
            if(map.containsKey(A.charAt(i))) {
                int t = map.get(A.charAt(i));
                map.remove(A.charAt(i));
                map.put(A.charAt(i), t + 1);
            } else {
                map.put(A.charAt(i), 1);
            }
        }
        
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < B.length(); i++) {
            if(map2.containsKey(B.charAt(i))) {
                int t = map2.get(B.charAt(i));
                map2.remove(B.charAt(i));
                map2.put(B.charAt(i), t + 1);
            } else {
                map2.put(B.charAt(i), 1);
            }
        }
        
        if(map.equals(map2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
        
