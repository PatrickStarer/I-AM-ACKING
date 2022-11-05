package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res  = new ArrayList();
        List<Integer> l = new ArrayList();
        backtrack(res,l,nums);
        return res;

    }

    public void backtrack(List<List<Integer>> res,List<Integer> l,int[]nums){
        if(l.size()==nums.length){
            //子集合已经存满 可以放入结果集中了
            res.add(new ArrayList<Integer>(l));

            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                //回溯
                backtrack(res,l,nums);
                //出栈
                l.remove(l.size()-1);

            }

        }

    }
}
