class Solution {
    public int solution(int n) {
        int[] arr = new int[30000];
        int answer = 0;
        int count = 0;
        
        for (int i=1; i <= n; i++) {
            if (n%i==0) { 
                arr[count] = i;
                count++;
            }
        }       
        
        for(int j=0; j < n; j++) {
            answer += arr[j];
        }
        
        
        return answer;
    }
}