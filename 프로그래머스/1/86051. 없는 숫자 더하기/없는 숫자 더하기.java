class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<10; i++){
          for(int j=0; j<numbers.length; i++){
              if(!(i == numbers[j])) {
                  answer+= i;
              }
          }

        }
        return answer;
    }
}