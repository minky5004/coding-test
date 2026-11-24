import java.util.Objects;

class Solution {

    public int solution(int num, int k) {

        String [] temp = String.valueOf(num).split("");

        for (int i = 0; i < temp.length; i++) {

            if (Objects.equals(temp[i], String.valueOf(k))) {

                return i + 1;

            }

        }

        return -1;

    }

}