class Solution {
    public String solution(int n) {
        String answer = "";
        String s = "수";
        String b = "박";
        for(int i = 1 ; i <= n ; i++ ) {
            if(i % 2 != 0){
                answer += s;
            }else {
                answer += b;
            }
        }
        return answer;
    }
}