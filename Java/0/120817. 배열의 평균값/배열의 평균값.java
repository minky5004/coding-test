class Solution {
    
    public double solution(int[] numbers) {
        
        int temp = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            
            temp += numbers[i];
            
        }

        return (double) temp / numbers.length;
        
    }
    
}