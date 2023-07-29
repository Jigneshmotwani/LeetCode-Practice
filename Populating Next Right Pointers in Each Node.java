
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            root.next = null;
            return root;
        }
        root.next = null;
        reccursion(root.left, root);
        reccursion(root.right, root);
        return root;

    }

    void reccursion(Node root, Node parent) {

        if (parent.left == root) {
            root.next = parent.right;

        } else {
            if (parent.next == null) {
                root.next = null;
            } else {
                root.next = parent.next.left;

            }

        }
        if (root.left != null) {
            reccursion(root.left, root);
            reccursion(root.right, root);
        }
    }
}

/*
 * if left then next --> parent.right
 * if right then
 * if parent.next != null then next --> parent.next.left
 * if parent.next == null then next --> null
 */