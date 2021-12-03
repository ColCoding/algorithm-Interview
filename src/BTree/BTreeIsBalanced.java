public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;//节点为空返回true
        if(IsBalanced_Solution(root.left) == false) return false; //节点的左子树不是平衡二叉树返回false
        if(IsBalanced_Solution(root.right) == false) return false;//节点的右子树不是平衡二叉树返回false
        //左右都为平衡二叉树判断高度差
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        if(Math.abs(lh - rh) > 1) return false;//如果左右子树高度差大于1就返回false
        return true;
    }
    public int getHeight(TreeNode root){
        if(root == null) return 0;//如果节点为空高度为0
        int lh = getHeight(root.left);//返回左子树高度
        int rh = getHeight(root.right);//返回右子树高度
        return Math.max(lh,rh) + 1;//取左子树和右子树高度中最大的并且+1
    }

}