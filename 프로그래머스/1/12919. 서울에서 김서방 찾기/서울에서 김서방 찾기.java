class Solution {
    public String solution(String[] seoul) {
        String answer = "Kim";
        int x = 0;
        for(int i=0; i<seoul.length; i++) {
            if (seoul[i].equals(answer)){
                x = i;
            }
        }
        return String.format("김서방은 %d에 있다", x);
    }
}
