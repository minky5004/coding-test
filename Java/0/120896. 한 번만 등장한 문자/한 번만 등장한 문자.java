import java.util.Arrays;

class Solution {

    public String solution(String s) {

        String temp = "";


        String [] arr = Arrays.stream(s.split("")).sorted().toArray(String[]::new);

        for (int i = 0; i < arr.length; i++) {

            if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i])) {

                temp = temp + arr[i];

            }

        }

        return temp;

    }

}