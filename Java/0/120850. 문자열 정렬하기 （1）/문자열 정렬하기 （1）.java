import java.util.Arrays;
import java.util.stream.Stream;

class Solution {

    public int[] solution(String my_string) {

        String temp = my_string.replaceAll("[a-zA-Z]","");

        String[] words = temp.split("");

        Stream<String> answer = Arrays.stream(words).sorted();


        int [] ans = new int [temp.length()];


        for (int i = 0; i < words.length; i++ ) {

            ans [i] = Integer.parseInt(words[i]);

        }

        return Arrays.stream(ans).sorted().toArray();

    }

}