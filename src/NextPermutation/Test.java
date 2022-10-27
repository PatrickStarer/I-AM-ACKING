package NextPermutation;

public class Test {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i=len - 2;
        //找到靠左的最小数
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        //找到尽可能靠右的最大数
        if(i>=0){
            int j = nums.length-1;
            while(j>=0&&nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        res(nums,i+1);
    }
    public void swap(int[] n ,int i ,int j){
        int temp= n[i];
        n[i] = n[j];
        n[j] =temp;
    }
    public void res(int[] n, int start){
        int l  = start;
        int r  = n.length-1;
        while(l<r){
            swap(n,l,r);
            l++;
            r--;
        }


    }
}
