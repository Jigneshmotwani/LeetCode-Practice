import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int l = s.length();
        Dictionary<String, Integer> d = new Hashtable<String, Integer>();
        d.put("I", 1);
        d.put("V", 5);
        d.put("X", 10);
        d.put("L", 50);
        d.put("C", 100);
        d.put("D", 500);
        d.put("M", 1000);
        Boolean sub = false;
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = l - 1; i >= 0; i--) {
            char a = s.charAt(i);
            Integer value = d.get(String.valueOf(a));
            if (value == null) {
                break;
            } else {
                sum += value.intValue();
                if (i < 0) {
                    break;
                }
                if (i > 0) {
                    char b = s.charAt(i - 1);

                    if ((a == 'M' || a == 'D') && (b == 'C')) {
                        sum -= 100;
                        sub = true;
                    } else if ((a == 'L' || a == 'C') && (b == 'X')) {
                        sum -= 10;
                        sub = true;
                    } else if ((a == 'V' || a == 'X') && (b == 'I')) {
                        sum -= 1;
                        sub = true;
                    }
                    if (sub == true) {
                        i -= 1;
                        sub = false;
                    }
                }

            }
        }

        return sum;
    }
}
