class Solution {

    public String solution(String my_string, int num1, int num2) {

        String [] temp = my_string.split("");
        
        String temp1 = "";
        
        temp1 = temp [num1];
        
        temp [num1] = temp [num2];
        
        temp [num2] = temp1 ;
        
        String ans = "";
        
        for (int i = 0; i < temp.length; i++) {
            
            ans += temp[i];
            
        }

        return ans;

    }
}