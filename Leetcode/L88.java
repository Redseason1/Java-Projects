package Leetcode;

public class L88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        for (int i : merge(nums1,3,nums2,3)){
            System.out.print(i + " ");
        }
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {  //以nums1最大值跟nums2數值從後面比較回來，一直判斷到nums1的長度為止
        int j = m - 1, k = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (j < 0) {
                nums1[i] = nums2[k--];
            } else if (k < 0) {
                nums1[i] = nums1[j--];
            } else {
                if (nums1[j] >= nums2[k]) {  //nums1當前值大於nums2當前值，nums1會賦值自己並將index(j)-1，此j為nums1目標放入長度
                    nums1[i] = nums1[j--];
                } else {
                    nums1[i] = nums2[k--];  //nums1當前值小於nums2當前值，nums1會被nums2賦值並將index(k)-1，此k亦同
                }
            }
        }
        return nums1;
    }
}
