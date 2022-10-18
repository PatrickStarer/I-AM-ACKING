package tree;

public class DFS {
    public int sumOfLeftLeaves(TreeNode root){
        //root为空返回0
        if(root==null)
            return 0;
        //对root深度遍历
        return DFS(root);

    }
    //深度遍历
    public  int DFS(TreeNode root){
     //总和
        int sum =0;
        if(root.left!=null){
            if(root.left.left==null&& root.left.right==null){
                sum += root.left.val;
            }else{
                sum += DFS(root.left);
            }
        }
        if(root.right!=null){
            sum += DFS(root.right);
        }
        return sum;
    }
}
