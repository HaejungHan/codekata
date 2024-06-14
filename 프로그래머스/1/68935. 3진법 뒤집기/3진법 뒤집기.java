class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = ""; // n의 나머지를 넣기 위한 변수
        
        while(n!=0){
            s += n % 3; // 뒤집어 넣기
            n /= 3; // n값 변경
        }
        
        answer = Integer.parseInt(s,3); // 3진수 -> 10진수
        return answer;
    }
}