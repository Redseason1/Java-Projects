package Leetcode;

import java.util.Scanner;
public class L7 {   //時間複雜度：O(n)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            System.out.println(reverse(n));
        }
        input.close();
    }
    public static int reverse(int x){
        long res = 0;
        while (x != 0){
            res = res * 10 + x % 10;
            x /= 10;
            if (res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE) return 0;
            
        }
        return (int)res;
    }
}
