import java.util.*;

class Solution {
    public int buyChoco(int[] prices, int money) {
        LinkedList<Integer> pricesList = new LinkedList<Integer>();
        for (int i = 0; i < prices.length; i++) {
            pricesList.add(prices[i]);
        }

        Collections.sort(pricesList);
        int cost = pricesList.get(0) + pricesList.get(pricesList.size() - 2);
        System.out.println(cost);

        if (cost > money) {
            return money;
        } else {
            return money - cost;
        }

    }
}