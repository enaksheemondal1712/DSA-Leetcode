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
    static ArrayList<Integer> list = new ArrayList<>();
    public void pre(TreeNode root)
    {
        if(root == null)    return;

        list.add(root.val);
        pre(root.left);
        pre(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        list.clear();
        pre(root);
        return list;
        
    }
}