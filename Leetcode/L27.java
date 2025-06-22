package Leetcode;

public class L27 {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,4,5};
        int val = 2;
        int [] res = new int [nums.length];
        int j = removeElement(nums, res, val);
        for (int i = 0; i < j; i++){
            System.out.print(res[i] + " ");
        }
    }
    public static int removeElement(int[] nums, int[] res, int val) {
        if (nums.length == 0 || nums == null) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                res[count++] = nums[i];
            }          
        }
        return count;
    }
}

/*
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || nums == null) return 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) nums[res++] = nums[i];
        }
        return res;
    }
*/