class Solution {
    public String solution(String s) {
        String answer = "";
        int i = s.length();
        
        if (i%2 == 0) { 
            answer = s.substring((i/2)-1,(i/2)+1);
        } else {
            answer = s.substring((i/2),(i/2)+1);
        }
        
        return answer;
    }
}