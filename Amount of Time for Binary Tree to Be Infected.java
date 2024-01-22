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
    int maxDistance = 0;

    public int amountOfTime(TreeNode root, int start) {
        
        transeverse(root, start);
        return maxDistance;

    }

    public int transeverse(TreeNode root, int start) {
        int depth = 0;
        if (root == null) {
            return 0;
        }

        int right = transeverse(root.right, start);
        int left = transeverse(root.left, start);

        if (root.val == start) {
            maxDistance = Math.max(right, left);
            depth = -1;
        } else if (left >= 0 && right >= 0) {
            depth = Math.max(left, right) + 1;
        } else {
            int distance = Math.abs(right) + Math.abs(left);
            maxDistance = Math.max(distance, maxDistance);
            depth = Math.min(left, right) - 1;
        }
        return depth;
        
    }
    
}