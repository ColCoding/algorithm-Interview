/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
        if(root != null){ //如果节点不为空就开始进行翻转
            //以下三行类似两个数交换
            TreeNode temp = root.left; //temp用于临时存储left节点，以防止在复制的时候丢失
            root.left = root.right;
            root.right = temp;
            Mirror(root.left); //把当前节点的左孩子进行翻转
            Mirror(root.right); //把当前节点的右孩子进行翻转
        }

    }
}