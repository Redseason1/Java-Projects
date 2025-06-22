package Leetcode;

import java.util.HashMap; 
public class L1 {   //時間複雜度：O(n)
    public static void main(String[] args) {
        int [] num = {2,7,11,15};
        int target = 9;
        for (int i : twoSum(num, target)){
            System.out.printf("%d ",i);
        }
    }

    public static int[] twoSum(int [] num,int target){
        if (num == null || num.length <= 2)
            return new int [] {0,1};
        
        int [] res = new int [] {0,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++){
            if (map.containsKey(target - num[i])){  //target - num的當前值有在mpa的key時
                res[0] = map.get(target - num[i]);  //res[0] = get target - num的當前值，key所對應的value
                res[1] = i;
                break;
            }
            map.put(num[i], i);
        }
        return res;
    }
}
