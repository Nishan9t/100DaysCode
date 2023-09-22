// https://leetcode.com/problems/recover-binary-search-tree



class Solution {
    private TreeNode prev = null;
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode third = null;
    public void recoverTree(TreeNode root) {
        findOutOfOrder(root);
        if (third != null) swap(first, third); // Eg: 3 2 1 => 1 2 3
        else swap(first, second); // Eg: 3 2 4 => 2 3 4
    }
    // Returns second element of sorted array which is out of order
    private void findOutOfOrder(TreeNode root) {
        if (root == null) return;
        findOutOfOrder(root.left);
        if (prev != null && second != null && third != null) return;
        if (prev != null && prev.val > root.val) {
            // First instance of out of order
            if (second == null) {
                first = prev;
                second = root;
            } else { // Second instance of out of order, may or may not exists
                third = root;
            }
        }
        prev = root;
        findOutOfOrder(root.right);
    }
    private void swap(TreeNode root1, TreeNode root2) {
        int tmp = root1.val;
        root1.val = root2.val;
        root2.val = tmp;
    }
}




