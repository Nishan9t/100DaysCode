// https://leetcode.com/problems/binary-tree-paths






/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       binaryTreePaths(root , "");
       return list;
        
    }
    public void binaryTreePaths(TreeNode root , String str)
    {
        
        if(root==null)
        {
           
            return;
        }
        //adding the node in path
        str +=root.val+"->";
        binaryTreePaths(root.left,str);
        binaryTreePaths(root.right,str);
        //when we are at leaf node
        if(root.left == null && root.right==null)
        {
            //"1->2->5->"
            //its len = 6
            //in above we have to only add "1->2->5"
            //it means we have to 0 to 4th index
            //that's why we are adding  str.length()-2
            
            list.add(str.substring(0,str.length()-2));
        }
        return;
    }
}
