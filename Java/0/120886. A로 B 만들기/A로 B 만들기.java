import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {

        String [] temp_before = before.split("");
        String [] temp_after = after.split("");

        Arrays.sort(temp_before);
        Arrays.sort(temp_after);

        if (Arrays.equals(temp_before, temp_after)) {

            return 1;

        } else {

            return 0;

        }

    }
}