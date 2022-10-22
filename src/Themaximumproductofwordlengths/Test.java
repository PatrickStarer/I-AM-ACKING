package Themaximumproductofwordlengths;

public class Test {
    public int maxProduct(String[] words) {
        int[] num= new int[words.length];
        //将对应的单词有无转换成0和1
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                num[i]|= (1<<words[i].charAt(j)-'a');
            }

        }
        //单词与单词，结果为零即不同
        int res = 0;
        for(int i = 0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if((num[i]&num[j])==0)
                    res = Math.max(res,words[i].length()*words[j].length());
            }
        }
        return res;






    }
}
