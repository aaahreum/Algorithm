class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) { 
            return false;
        }
        for(char x : s.toCharArray()){
            if (!Character.isDigit(x)){
                answer = false;
                break;
            }
        }
        return answer;
    }
}