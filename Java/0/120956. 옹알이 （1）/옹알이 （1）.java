import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {

        String[] str = {"aya", "ye", "woo", "ma"};

        int count = 0;

        for(int i=0; i<babbling.length; i++){

            for (String s : str) {

                babbling[i] = babbling[i].replace(s, " ");

            }

            if(babbling[i].trim().isEmpty()){

                count++;

            }
        }
        return count;

    }
}