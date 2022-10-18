package tree;

public class Recursion {

    //递归
    private int sum = 0;//总和
    public  int sumOfLeftLeaves(TreeNode root){

        if(root==null) //结点为空，返回0
        return 0;

        //关键判断，要左节点的和，提前判断，不然不知道哪个是左节点
        if(root.left!=null){
            if(root.left.left==null&&root.left.right!=null){
                sum += root.left.val;
            }
        }

        //递归
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return sum;

    }

}
