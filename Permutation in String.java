/* 

BRUTEFORCE:



import java.util.LinkedList;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        LinkedList<Character> l1 = new LinkedList<Character>();
        for (int i = 0; i < c1.length; i++) {
            l1.add(c1[i]);
        }
        LinkedList<Character> l2 = new LinkedList<Character>();
        for (int i = 0; i < c2.length; i++) {
            l2.add(c2[i]);
        }

        if (c2.length < c1.length) {
            return false;
        } else {
            for (int i = 0; i <= l2.size() - l1.size(); i++) {
                LinkedList<Character> temp = new LinkedList<>(l1);

                for (int j = i; j < i + l1.size(); j++) {
                    if (temp.contains(l2.get(j))) {
                        temp.remove((Character) l2.get(j));
                    } else {

                        break;
                    }
                }
                if (temp.isEmpty()) {
                    return true;
                }

            }

            return false;
        }

    }
}

*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2)
            return false;

        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count))
            return true;

        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count))
                return true;
        }

        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}