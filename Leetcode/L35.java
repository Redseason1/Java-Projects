package Leetcode;

public class L35 {
    public int searchInsert(int[] nums, int target) {  //binary search
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end){
            int mid = (end - start) / 2 + start;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid; //往左搜尋
            else start = mid;   //往右搜尋
        }
        if (target <= nums[start]) return start;  //target的index等於start，或是target小於nums[start]，即target的index等於start，nums[start]的index + 1
        else if (target <= nums[end]) return end;  //target的index等於end，或是target小於nums[end]，即target的index等於end，nums[end]的index + 1
        else return end + 1;  //索引位置：start end target
    }
}
