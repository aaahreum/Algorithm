class Solution {
    public int[] solution(long n) {
        String str_n = Long.toString(n);
        int[] answer = new int[str_n.length()];;
        int i = 0;
        
        while(n > 0){
            answer[i++] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}