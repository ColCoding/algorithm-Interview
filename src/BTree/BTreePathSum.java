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
     * @param sum int整型 
     * @return int整型ArrayList<ArrayList<>>
     */

    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(); //用于存储结果
    ArrayList<Integer> temp = new ArrayList<Integer>(); //用于存储路径

    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        dfs(root,sum,0);
        return res;    
    }
    public void dfs(TreeNode root, int sum,int cnt) {
        if(root == null) return; // 如果节点为空结束当前递归
        temp.add(root.val); // 将当前节点加入tmp数组
        cnt += root.val; // 把当前节点加入到路径和中
        if(root.left == null && root.right == null){ //当递归到没有子树的时候就需要判断
            if(cnt == sum){ //如果当前节点的路径和等于sum，那么就在res中插入tmp
                res.add(new ArrayList<>(temp));
            }
        }else{
            dfs(root.left,sum,cnt); //递归左子树
            dfs(root.right,sum,cnt); //递归右子树
        }
        // 出一层递归要把当前节点剪掉
        temp.remove(temp.size() - 1);
    }

}