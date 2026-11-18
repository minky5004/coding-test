import java.util.Arrays;

class Solution {

    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int minus_max = numbers[0] * numbers[1];

        int plus_max = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return Math.max(minus_max, plus_max);

    }

}