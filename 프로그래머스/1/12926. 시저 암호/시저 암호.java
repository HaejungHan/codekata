class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = new char[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i); // ch(0) = A, ch(1) = B 
            if (ch>=65 && ch<=90) { // A 65 B 66
                ch += n; // 66 67 -> BC
                if(ch>90) {
                    ch-=26;
                }
            } else if (ch>=97 && ch<=122) {
                ch += n;
                if(ch>122) {
                    ch-=26;
                }
            }
            arr[i] = ch; // arr[0] = B,  arr[1] = C
        } answer = String.valueOf(arr); // BC
        return answer;
    }
}