class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        for(int i=0; i<t.length() - p.length() + 1; i++){ 
            String str = t.substring(i, i + p.length()); // t를 p문자열 길이만큼 자르기
            if (Long.parseLong(str) <= pNum){
                answer++;
            }
        }
        return answer;
        }
    }