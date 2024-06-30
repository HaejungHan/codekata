class Solution {
    boolean solution(String s) {
        boolean answer;
        Stack<Character> stack = new Stack<>(); 
        
        for(int i=0; i<s.length(); i++) {
            Character c = s.chartAt(i);
            if (c == '(') {
                stack.push(c);
            } else { // ')'라면
                if (stack.isEmpty()) { // stack이 비어있는지 확인 '('없다면 올바르지 않은 괄호이기에
                    return answer = false;
                } 
                stack.pop(); // '('와 짝을 맞추기 위해 push 했던 '(' 를 제거
            }
        }
        if (!stack.isEmpty()) {
            return answer = false;
        }
        
        return answer = true;
    }
}