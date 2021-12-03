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
     * @return bool布尔型
     */
    public boolean isSymmetric (TreeNode root) {
        if(root == null) return true;//当根节点为空的时候返回true
        Queue<TreeNode> q = new LinkedList<TreeNode>();//定义一个队列，用于存储每一层的节点
        q.add(root.left);//把根节点的左孩子放队列
        q.add(root.right);//把根节点的右孩子放队列
        while(!q.isEmpty()){//队列不为空就执行下面的操作
            TreeNode node1 = q.poll();//取出队列的头元素并弹出
            TreeNode node2 = q.poll();//取出队列的头元素并弹出
            if(node1 == null && node2 == null) continue;//当前取出的两个节点都为空的时候继续
            if(node1 == null || node2 == null || node1.val != node2.val) return false;//取出的两个节点有一个为空或者值不相等都返回false
            //通过看图会发现节点的左孩子对应另一个节点的右孩子
            //节点的右孩子对应另一个节点的左孩子
            q.add(node1.left);
            q.add(node2.right);
            q.add(node1.right);
            q.add(node2.left);
        }
        return true;

    }
}