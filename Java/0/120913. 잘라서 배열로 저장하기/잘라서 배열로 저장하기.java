class Solution {
    
    public String[] solution(String my_str, int n) {
        
        int count = (my_str.length() + n - 1) / n;            
        
        String[] ans = new String[count];
        
        for (int i = 0; i < count; i++) {
            
            ans[i] = my_str.substring(i * n, Math.min((i + 1) * n, my_str.length()));
            
        }
        
        return ans;
        
    }
}    