import java.util.Arrays;

class Solution {

    public int solution(int[] array) {

        String [] arr = new String[array.length];

        String [] temp;

        int count = 0;
        
        for (int i = 0; i < array.length; i++) {

            arr[i] = String.valueOf(array[i]);

            temp = arr[i].split("");

            for (int j = 0; j < temp.length; j++) {

                if (temp[j].equals("7")) {

                    count++;

                }

            }

        }

        return count;

    }

}