class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int firstNumber = x;
        int sum = 0;
        while(0 < x){
            sum += x % 10;
            x /= 10;
        }
        
        if(firstNumber % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}