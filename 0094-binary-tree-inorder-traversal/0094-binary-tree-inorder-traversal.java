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
    public List<Integer> inorderTraversal(TreeNode root) {
        //List to store the result 
        List<Integer> result = new ArrayList<>();
        //Helper function to perform traversal
        inorderHelper(root, result);
        //Return the result list 
        return result ;
    }
    private void inorderHelper(TreeNode root , List<Integer> result){
        if(root == null){
            return ;
        }
        //Traverse the left subtree
        inorderHelper(root.left, result);
        //Add the current node's value to the result list
        result.add(root.val);
        //Traverse the right subtree
        inorderHelper(root.right, result);
    }
}