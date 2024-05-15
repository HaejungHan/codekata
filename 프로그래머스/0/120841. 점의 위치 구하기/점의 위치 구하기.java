class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int num = 0;
        int x = dot[0];
        int y = dot[1];
        
        if (x > num && y > num) {
         return 1;
        } else if (x < num && y > num) {
         return 2;
         } else if (x < num && y < num) {
            return 3;
         } else if (x > num && y < num) {
           return 4;
            }

        return answer;
    }
}