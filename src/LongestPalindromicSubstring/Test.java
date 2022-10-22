package LongestPalindromicSubstring;

public class Test {
    /**
     * 动态规划
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        int start = 0;
        int max = 1;
        boolean[][] b = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            b[i][i] = true;
        }
        char[] c = s.toCharArray();
        for (int len = 2; len <= s.length(); len++) {
            //遍历0到1 1到2 2到3..s.length()-1到s.length()
            //遍历0到2 1到3 2到4..s.length()-2到s.length()
            //遍历0到3 1到4 2到5..s.length()-3到s.length()
            for (int i = 0; i < s.length(); i++) {
                int j = len + i - 1;
                if (j >= s.length())
                    break;
                if (c[i] != c[j]) {
                    b[i][j] = false;
                } else {
                    if (j - i < 3)
                        b[i][j] = true;
                    else {
                        b[i][j] = b[i + 1][j - 1];

                    }
                    //记录最长字符的起始和长度
                    if (b[i][j] && j - i + 1 > max) {
                        max = j - i + 1;
                        start = i;
                    }
                }
            }

        }

        return s.substring(start, start + max);
    }
}
