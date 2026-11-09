class Solution {
    public int solution(int[] sides) {
        int count = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int sum = max + min;

        for (int i = 1; i <= sum; i++) {
            
            if ((i+min) > max && (i+min) <= sum){
                
                count++;
                
            }
            
        }
        
        count += (sum - max)-1;

        return count;
    }
}