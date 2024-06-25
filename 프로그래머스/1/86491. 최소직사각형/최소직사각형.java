import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0;
        int max_h = 0;
        
        for (int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]); // 작은순으로 정렬하기
        }
        
        for(int i=0; i<sizes.length; i++){
            // [50,60] [30,70] [30,60] [40,80] 정렬됨
            if(max_h < sizes[i][0]) { // 세로길이 50
                max_h = sizes[i][0];
            }
            if (max_w < sizes[i][1]) { // 가로길이 80
                max_w = sizes[i][1];
            }
        } answer = max_w * max_h; 
        return answer; 
    }
}