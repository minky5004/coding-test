import java.util.Arrays;

class Solution {

    public int solution(int[] array, int n) {

        Arrays.sort(array);

        int [] distant = new int[array.length];

        int temp;

        int minIdx = 0;

        for (int i = 0; i < array.length; i++) {

            temp = array[i] - n;

            if (temp < 0) {

                temp = -temp;

                distant[i] = temp;

            } else {

                distant[i] = temp;

            }

        }

        for (int j = 0; j < distant.length; j++) {

            if (distant[j] < distant[minIdx]) {

                minIdx = j;

            }

        }

        return array[minIdx];

    }

}