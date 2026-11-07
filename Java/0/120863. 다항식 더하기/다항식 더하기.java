class Solution {
    public String solution(String polynomial) {
        
        int count = 0;
        
        int num = 0;

        String[] result = polynomial.split(" ");

        for(int i=0; i<result.length; i++){
            
            if(result[i].contains("x")){
                
                if(result[i].equals("x")){
                    
                    count += 1;
                    
                } else {
                    
                    result[i] = result[i].replace("x", "");
                    
                    int temp = Integer.parseInt(result[i]);
                    
                    count += temp;
                    
                }
            }
            else if(!result[i].equals("+")){
                
                int temp = Integer.parseInt(result[i]);
                
                num += temp;
                
            }
        }

        if(count == 1){
            
            if(num == 0){
                
                return "x";
                
            }
            else {
                
                return  "x + " + num;
                
            }
            
        }
        
        else if(count == 0){
            
            if(num == 0){
                
                return  "0";
                
            }
            else {
                
                return Integer.toString(num);
                
            }
        }
        
        else {
            
            if(num == 0){
                
                return count + "x";
                
            }
            
            else {
                
                return count + "x + " + num;
                
            }
            
        }
        
    }
    
}
