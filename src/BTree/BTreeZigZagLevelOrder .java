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
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); //用于存储返回结果
        Queue<TreeNode> q = new LinkedList<TreeNode>();//创建队列用于存储节点
        if(root == null){
            return res; //当为空的时候直接返回
        }
         int height = 1;//用于处理之字形遍历，奇数就直接插入，偶数就插入temp头
        q.add(root); //插入节点
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<Integer>();// 存储每一层的数字
            int n = q.size();// 队列大小表示当前层数的元素个数
            for(int i = 0;i < n;i ++){
                TreeNode node = q.poll();//取出队列的第一个元素
                if(height % 2 == 0){
                      temp.add(0,node.val);// 如果层数是偶数就插入到头
                }else{
                    temp.add(node.val); //如果层数是奇数就直接放进去  
                }
                if (node.left != null)
                    q.add(node.left); //如果左子树不为空，左子树入队
                if (node.right != null)
                    q.add(node.right); //如果右子树不为空，右子树入队
            }
             height ++; //高度++
             res.add(new ArrayList<>(temp)); //把这一层的节点插入到res中
        }
        return res;
    }
}