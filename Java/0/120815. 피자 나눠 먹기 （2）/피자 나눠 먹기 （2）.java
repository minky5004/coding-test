class Solution {

    public int solution(int n) {
        
        int answer = (n * 6) / gcd(n, 6) / 6;

        return answer;

    }
    
    public static int gcd(int a, int b) {
        
        while (b != 0) {
            
            int r = a % b;
            
            a = b;
            
            b = r;
            
        }
        
        return a;
        
    }

}