import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        Arrays.sort(sArr,Collections.reverseOrder());
        answer = new String();
        for (int i=0; i<sArr.length; i++){
            answer += sArr[i];
        }
        
        return answer;
    }
}