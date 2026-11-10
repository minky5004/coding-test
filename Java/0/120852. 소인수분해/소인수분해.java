import java.util.Arrays;

class Solution {
    public int[] solution(int n) {

        String temp = "";

        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {

                n = n / i;

                temp = temp + i + " ";

            }

        }

        String [] temp2 = temp.split(" ");

        return Arrays.stream(temp2).distinct().mapToInt(Integer::parseInt).toArray();
        
    }

}