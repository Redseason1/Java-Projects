package Leetcode;

public class L28 {  //時間複雜度：O(n^2)
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++){ //以haystack.length() - needle.length()代表搜尋次數
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;    //以needle的長度在haystack裡搜尋
        }
        return -1;
    }
}
