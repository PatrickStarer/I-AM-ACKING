给你一个字符串 s，找到 s 中最长的回文子串。
示例 1：

输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
示例 2：

输入：s = "cbbd"
输出："bb"

解法一：动态规划，时间复杂度为 O（n^2）,空间复杂度为O（n^2），存储动态规划状态需要的空间。
解法二：中心扩展，时间复杂度为 O（n^2）,空间复杂度为O（1）