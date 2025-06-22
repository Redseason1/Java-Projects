package Leetcode;

public class L66 {  //時間複雜度：O(n)
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] res = new int [digits.length + 1];  //用來只有長度為1的陣列使用，Ex：[9]
        res[0] = 1;
        return res;
    }
}
