class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0; i < 10; i++) {
            for(int number : numbers) {
                if(i == number) {
                    answer -= number;
                }
            }
        }
        return answer;
    }
}