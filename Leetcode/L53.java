package Leetcode;

public class L53 {  //時間複雜度：O(n)
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        int res = nums[0];  //當前最大值
        for (int i = 1; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i - 1] < 0 ? 0 : dp[i - 1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
