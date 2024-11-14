class Solution {
    public String solution(String s) {
        String answer = "";
        int x = s.length() / 2 - 1;
        int y = s.length() / 2;
        if(s.length() % 2 == 0){
            answer = s.substring(x, y+1);
        } else {
            answer = s.substring(y, y+1);
        } 
        
        return answer;
        
    }
}