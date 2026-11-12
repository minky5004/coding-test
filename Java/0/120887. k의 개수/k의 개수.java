class Solution {

    public int solution(int i, int j, int k) {

        int answer = 0;
        
        for (int l = i; l <= j; l++) {
            
            String [] temp = String.valueOf(l).split("");
            
            for (int n = 0; n < temp.length; n++) {
                
                if (temp[n].equals(String.valueOf(k))) {
                    
                    answer++;
                    
                }
                
            }
            
        }

        return answer;

    }

}