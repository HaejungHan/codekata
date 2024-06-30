import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            
            if(c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return answer = false;
                }
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) {
            return answer = false;
        }

        return answer = true;
    }
}