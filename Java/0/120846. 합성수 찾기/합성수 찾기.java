class Solution {

    public int solution(int n) {

        int count = 0;

        for  (int i = 2; i <= n; i++) {

            if (is_prime(i)){

                count++;

            }

        }

        return n - count - 1;

    }

    public static boolean is_prime(int num) {
        
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

              return false;

            }

        }

        return true;

    }

}