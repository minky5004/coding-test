class Solution {
    public int solution(int balls, int share) {

        long ans = 1;

        for (int i = 0; i < share; i++) {

            ans = ans * (balls - i) / (i + 1);

        }

        return (int) ans;

    }
}