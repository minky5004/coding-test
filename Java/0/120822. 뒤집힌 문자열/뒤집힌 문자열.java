class Solution {
    
    public String solution(String my_string) {
        
        String [] answer_array = new String[my_string.length()];
        
        String [] temp = my_string.split("");
        
        String answer = "";
        
        for (int i = 0; i < answer_array.length; i++) {
            
            answer_array[i] = temp[temp.length - i - 1];
            answer += answer_array[i];
            
        }
        
        return answer;
        
    }
    
}