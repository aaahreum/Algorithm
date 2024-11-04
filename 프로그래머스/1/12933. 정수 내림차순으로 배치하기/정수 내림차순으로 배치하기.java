import java.util.Arrays;

class Solution {
    public long solution(long n) {
                
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++ ){
            sb.append(str[i]);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}