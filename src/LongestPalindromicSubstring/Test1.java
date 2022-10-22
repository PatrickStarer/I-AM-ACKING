package LongestPalindromicSubstring;

public class Test1 {

    /**
     * 中心扩散
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        //边界情况是一个回文字符串长度为1或2（偶数回文或奇数回文），我们从1或2开始，枚举每一种情况，并记录。
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);//对一个字符向外扩展
            int len2 = expandAroundCenter(s, i, i + 1);//对两个字符向外扩展
            int len = Math.max(len1, len2);//取最大值

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    //中心扩展
    public int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            //当left==right时，向两边扩展
            --left;
            ++right;
        }
        //最后返回回文长度
        return right - left - 1;
    }

}
