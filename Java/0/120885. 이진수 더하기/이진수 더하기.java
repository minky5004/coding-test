
class Solution {
    public String solution(String bin1, String bin2) {

        String ans = Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
        
        return ans;
        
    }
}
