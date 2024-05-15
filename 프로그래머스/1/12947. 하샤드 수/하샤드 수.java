class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x); //1 2
        int[] arr = new int[s.length()]; // arr[x,x];
        int sum =0;
        
        for(int i=0; i<s.length(); i++) {
            arr[i] = Integer.parseInt(s.substring(i,i+1));
            sum += arr[i];
                if(x % sum == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
            }
        
        return answer;
    }
}