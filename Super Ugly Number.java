import java.util.PriorityQueue;

class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < primes.length; i++) {
            pq.add(new int[]{primes[i], primes[i], 0});
        }
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            ugly[i] = pq.peek()[0];
            while (pq.peek()[0] == ugly[i]) {
                int[] next = pq.poll();
                pq.add(new int[]{next[1] * ugly[next[2] + 1], next[1], next[2] + 1});
            }
        }
        return ugly[n - 1];
    }
}