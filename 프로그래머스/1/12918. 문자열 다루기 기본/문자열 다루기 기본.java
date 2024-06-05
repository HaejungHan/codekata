class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String REGEXP_P = "^[\\d]*$";
        
        if ((s.length() == 4 || s.length() == 6) && s.matches(REGEXP_P)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}