import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int[] arr = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            arr[i] = count;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int maxIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxCount++;
                maxIndex = i;
            }
        }

        return maxCount == 1 ? array[maxIndex] : -1;
    }
}
