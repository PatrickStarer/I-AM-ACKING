package fruits;
public class Test {
    public int totalFruit(int[] f) {
        int l=0;
        int type=0;
        int diff=0;
        int res=0;
        int cur = 0;
        int[] w = new int[f.length];
        for(int i=0;i<f.length;i++){
            if(w[f[i]]==0){
                if(type==2){
                    res = Math.max(res,i-l);
                    w[f[diff-1]] = 0;
                    type--;
                    l = diff;
                }
                type++;
                w[f[i]] =1;
            }

            if(cur != f[i]){
                cur = f[i];
                diff = i;
            }
        }
        return Math.max(res,f.length-l);

    }
}
