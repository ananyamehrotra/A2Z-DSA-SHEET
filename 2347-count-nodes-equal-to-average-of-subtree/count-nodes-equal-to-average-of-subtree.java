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
    int count=0;
    class Pair{
        int s, c;
        Pair(int s, int c){
            this.s=s;
            this.c=c;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        avg(root);
        return count;
    }
    public Pair avg(TreeNode root){
        if(root==null)return new Pair(0,0);
        Pair left=avg(root.left);
        Pair right=avg(root.right);

        int s=left.s+right.s+root.val;
        int c=1+left.c+right.c;

        if(s/c==root.val)count++;
        return new Pair(s,c);
    }
}