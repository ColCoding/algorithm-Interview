import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        if(root == null) return 0; //节点为空返回0
        int lh = maxDepth(root.left); // 求出左子树的最大高度
        int rh = maxDepth(root.right); //求出右子树的最大高度
        return Math.max(lh,rh) + 1; //左右子树高度求一个最大然后+1
    }
}