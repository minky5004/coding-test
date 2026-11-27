class Solution {

    public String solution(String my_string, int n) {

        String [] temp = my_string.split("");

        String answer = "";


        for (int i = 0; i < temp.length; i++) {

            for (int j = 0; j < n; j++) {

                answer += temp[i];

            }

        }

        return answer;

    }

}
