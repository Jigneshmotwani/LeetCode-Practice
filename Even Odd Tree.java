import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEvenLevel = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevValue = isEvenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) continue;

                if (isEvenLevel && (node.val % 2 == 0 || node.val <= prevValue)) {
                    return false;
                } else if (!isEvenLevel && (node.val % 2 != 0 || node.val >= prevValue)) {
                    return false;
                }

                prevValue = node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            isEvenLevel = !isEvenLevel;
        }

        return true;
    }
}