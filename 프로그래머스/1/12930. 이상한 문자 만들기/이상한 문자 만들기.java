class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        int index = 0;
        
        for (int i=0; i<sArr.length; i++){
            if(sArr[i].equals(" ")){
                index=0;
            } else if(index % 2 == 0){
                sArr[i] = sArr[i].toUpperCase();
                index++;
            } else if (index % 2 != 0) {
                sArr[i] = sArr[i].toLowerCase();
                index++;
            } answer += sArr[i];
        } return answer;
    }
}