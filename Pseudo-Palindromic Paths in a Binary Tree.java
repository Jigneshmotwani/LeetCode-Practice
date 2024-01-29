import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int count = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] freq = new int[10];
        dfs(root, freq);
        return count;
    }

    private void dfs(TreeNode node, int[] freq) {
        if (node == null)
            return;
        freq[node.val]++;
        if (node.left == null && node.right == null) {
            if (isPseudoPalindrome(freq)) {
                count++;
            }
        } else {
            dfs(node.left, freq);
            dfs(node.right, freq);
        }
        freq[node.val]--;
    }

    private boolean isPseudoPalindrome(int[] freq) {
        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }
}