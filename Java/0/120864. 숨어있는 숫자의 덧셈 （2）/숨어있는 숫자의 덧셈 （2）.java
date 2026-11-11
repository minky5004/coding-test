class Solution {

    public int solution(String my_string) {

        int ans = 0;

        String Only_Int =  my_string.replaceAll("[a-zA-Z]", " ");

        String [] Only_Int_Array =  Only_Int.split(" ");

        for (int i = 0; i < Only_Int_Array.length; i++) {

            if (Only_Int_Array[i].equals("")) {

                continue;

            } else {

                ans += Integer.parseInt(Only_Int_Array[i]);

            }

        }

        return ans;

    }

}