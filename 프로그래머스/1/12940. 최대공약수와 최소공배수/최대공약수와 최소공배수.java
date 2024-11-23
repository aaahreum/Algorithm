class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int j = 0;
        int max = 0;
        
        for(int i = 1; i <= n ; i++) {
            if(n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        answer[0] = max;
        
        int min = ( n * m ) / max; 
        answer[1] = min;
        
        return answer;
    }
}