// https://leetcode.com/problems/serialize-and-deserialize-binary-tree



public class Codec {
    static TreeNode res;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        res = root;
        return "";
        
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      return res;
    }
}
