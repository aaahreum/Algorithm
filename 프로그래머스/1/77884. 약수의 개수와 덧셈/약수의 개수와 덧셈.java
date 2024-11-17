class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int x = left; x <= right; x++){
            int num = 0;
            for(int y = 1; y <= x ; y++){
                if( x % y == 0){
                    num++;
                }
            }
            if (num % 2 == 0) { 
                answer += x;
            } else { 
                answer -= x;
            }
        }

        return answer;
    }
}