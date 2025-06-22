package Leetcode;

public class L58 {  //時間複雜度：O(n)
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        String [] str = s.trim().split(" ");
        for (int i = str.length - 1; i >= 0; i--){
            if (str[i].length() != 0) return str[i].length();
        }
        return 0;
    }
}
