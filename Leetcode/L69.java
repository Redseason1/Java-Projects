package Leetcode;

public class L69 {
    public int mySqrt(int x) {
        int low = 1, high = x;       
        while (low <= high){
            int mid = (high - low) / 2 + low;
            int m = x / mid;
            if (mid == m) return mid;
            else if (mid > m) high = mid - 1;  //往左偏移
            else if (mid < m) low = mid + 1;  //往右偏移
        }
        return low - 1;
    }
}
