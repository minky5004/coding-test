import java.util.Arrays;

class Solution {

    public int solution(int[] array) {
        
        int [] temp = new int[array.length];

        int ans = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            temp[i] = (array[i]);
            
        }
        
        Arrays.sort(temp);
        
        ans = (temp[temp.length/2]);
        
        return ans;

    }
    
}