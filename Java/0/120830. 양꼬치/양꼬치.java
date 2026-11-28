class Solution {

    public int solution(int n, int k) {

        int temp = n;

        int count = 0;

        while (n >= 10) {

            n -= 10;

            count++;

        }

        k -= count;

        return (temp * 12000) + (k * 2000);

    }

}