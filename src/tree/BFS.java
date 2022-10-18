package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BFS {
    //宽度优先遍历
    public int sumOfLeftLeaves(TreeNode root){
        if(root==null)
            return 0;
        int ans = 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();

            while (len > 0) {
                TreeNode node = queue.remove();
                len--;
                if (node.left != null) {
                    if (node.left.left == null && node.left.right == null) {
                        ans += node.left.val;
                    } else {
                        queue.add(node.left);
                    }
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }
        return ans;

    }
}
