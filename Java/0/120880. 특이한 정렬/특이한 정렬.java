import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Integer[] temp = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            
            if (distA == distB) {
                
                return b.compareTo(a);
                
            }

            return Integer.compare(distA, distB); 
            
        });
        
        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
        
    }
    
}