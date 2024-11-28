class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_height = 0;
        int max_width = 0;
        
        for(int i = 0; i < sizes.length ; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            max_height = Math.max(max_height, max);
            max_width = Math.max(max_width, min);            
        }
        
        return max_height * max_width;
    }
}