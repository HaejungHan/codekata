class Solution {
    public int[] solution(long n) {
        String nStr = String.valueOf(n);
        int[] answer = new int[nStr.length()];
        for(int i=0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(nStr.substring(answer.length-1-i,answer.length-i));
        }
        return answer;
    }
}