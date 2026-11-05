class Solution {
    public int solution(int chicken) {
        
        int answer = 0;

        while (chicken >= 10) {
            
            int ten = chicken / 10;
            int one = chicken % 10;

            chicken = ten + one;
            answer += ten;
            
        }

        return answer;
        
    }
}