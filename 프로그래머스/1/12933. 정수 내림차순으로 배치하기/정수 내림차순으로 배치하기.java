import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // Long타입 n을 String으로 변경하여 배열에 한 글자씩 저장
        String[] arr = String.valueOf(n).split("");
        
        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        
        String str = new String(); // String타입 객체생성
        for(int i=0; i<arr.length; i++){ 
            str += arr[i]; // 객체에 담기
        }
        answer = Long.parseLong(str); // Long타입 변환
        return answer;
        }
    }