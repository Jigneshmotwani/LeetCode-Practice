import java.util.*;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> tr = new ArrayList<>();
        InOrder(root, tr);
        int a = tr.indexOf(low);
        int b = tr.indexOf(high);
        int ans = 0;
        for(int i = a;i<=b;i++){
            ans+=tr.get(i);
        }
        return ans;

        
    }

    public void InOrder(TreeNode r, List<Integer> t){
    if (r != null) {
        InOrder(r.left, t); 
        t.add(r.val); 
        InOrder(r.right, t); 
    }
}
}

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

