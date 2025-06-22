package Leetcode;

public class L70 {
    public int climbStairs(int n) {  //費式數列
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++){
            int temp = b;
            b += a;  //b加上自己前一次的位置
            a = temp;  //a紀錄b前一次的位置
        }
        return b;
    }
}
