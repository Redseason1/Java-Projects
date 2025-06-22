package Leetcode;

import java.util.Stack;
public class L20 {  //時間複雜度：O(n)
    public boolean isValid(String s){   //stack:先進後出
        if (s.length() == 0 || s == null) return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else 
                if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty(); //判斷一個符號時使用 ex: { ; push -> } 如果stack不為空，那就回傳true
    }
}
