class Solution {

    public String solution(String cipher, int code) {

        String [] temp = cipher.split("");

        String ans = "";

        for (int i = code - 1; i < temp.length; i += code) {

            ans += temp[i];

        }

        return ans;

    }

}