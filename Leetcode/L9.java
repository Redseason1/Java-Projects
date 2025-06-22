package Leetcode;

import java.util.Scanner;
public class L9 {   //時間複雜度：O(n)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            System.out.println(isPalindrome(n));
        }
        input.close();
    }

    public static boolean isPalindrome(int x){
        StringBuilder string = new StringBuilder(String.valueOf(x));  //StringBuilder放int代表有多少位置，需轉成string
        if (string.toString().equals(string.reverse().toString())) return true;  //StringBuilder不等於string，需轉成string
        else return false;
    }
}
