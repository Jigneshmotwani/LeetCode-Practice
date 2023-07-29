/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int a = 1;
        int b = n;

        while (a <= b) {
            int c = a + (b - a) / 2;
            if (a == b || a == b + 1) {
                return c;
            } else if (isBadVersion(c) == false) {
                a = c + 1;
            } else {
                b = c;
            }
        }
        return 0;
    }
}