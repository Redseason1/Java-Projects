package Leetcode;

public class L26 {
    public static void main(String[] args) {
        int [] nums = {1,1,3,3,5};
        int res [] = new int [nums.length];
        int j = removeDuplicates(nums,res);
        for (int i = 0; i <= j; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums,int[] res) {
        if (nums.length == 0 || nums == null) return 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] != nums[i]){
                res[count++] = nums[i - 1];
                res[count] = nums[i];
            } 
        }
        return count;
    }
}

/*
    public int removeDuplicates(int[] nums) {   //時間複雜度：O(n)
        if (nums.length == 0 || nums == null) return 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] != nums[i]) nums[count++] = nums[i];    //先做nums[count] = num[i]，再做count+1
        }
        return count;
    }
*/
