class Solution {

    public String solution(String my_string, String letter) {

        String answer = "";
        
        String [] temp = my_string.split("");
        
        for (int i = 0; i < temp.length; i++) {
            
            if (!temp[i].equals(letter)) {
                
                answer +=  temp[i];
                
            } 
            
        }

        return answer;

    }

}