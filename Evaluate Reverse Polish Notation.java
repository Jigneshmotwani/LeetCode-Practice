import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<String> l1 = new Stack<>();
        Stack<String> l2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                l2.add(tokens[i]);
            } else {
                l1.add(tokens[i]);
            }
            while (!l2.isEmpty()) {
                int a = Integer.parseInt(l1.pop());
                int b = Integer.parseInt(l1.pop());
                String s = l2.pop();
                if (s.equals("+")) {
                    l1.push(String.valueOf(a + b));
                } else if (s.equals("-")) {
                    l1.push(String.valueOf(b - a));
                } else if (s.equals("*")) {
                    l1.push(String.valueOf(a * b));
                } else if (s.equals("/")) {
                    l1.push(String.valueOf(b / a));
                }
            }
        }
        return Integer.parseInt(l1.pop());
    }
}