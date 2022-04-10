package bfs;

/**
 * 二叉树的最大深度
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * @author liuhj
 * @date 2021/12/18 17:53
 */
public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        return bfs(root,0);
    }

    public static Integer bfs(TreeNode node, Integer layer){
        if (node == null){
            return layer;
        }
        return Math.max(bfs(node.left,layer+1),bfs(node.right,layer+1));
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        Integer val;
    }
}
