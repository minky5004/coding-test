import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    public String solution(String my_string) {

        String [] my_strings = my_string.split("");

        return Arrays.stream(my_strings).distinct().collect(Collectors.joining());

    }

}