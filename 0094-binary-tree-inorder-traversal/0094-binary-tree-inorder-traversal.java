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
    public List<Integer> inorder(List<Integer> arr,TreeNode root){
        if(root==null) return arr;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
        return arr;
    } 
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>(); 
        if(root==null) return arr;
        inorder(arr,root); 
        return arr; 
    }
}
