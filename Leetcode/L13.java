package Leetcode;

public class L13 {  //時間複雜度：O(n)
    public int romanToInt(String s){
        int len = s.length();
        int n = 0;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'V': n += 5; break;
                case 'L': n += 50; break;
                case 'D': n += 500; break;
                case 'I': n += (n >= 5 ? -1 : 1); break;
                case 'X': n += (n >= 50 ? -10 : 10); break;
                case 'C': n += (n >= 500 ? -100 : 100); break;
                case 'M': n += 1000; break;
            }
        }
        return n;
    }    
}
