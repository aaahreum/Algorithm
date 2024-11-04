class Solution {
    public long solution(long n) {
        
        for(long x = 1; x * x <= n ; x++){
            if(n == x * x){
                return (x + 1) * (x + 1);
            }
        }
        
        return -1;
    }
}