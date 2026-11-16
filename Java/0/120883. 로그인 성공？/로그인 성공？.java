class Solution {

    public String solution(String[] id_pw, String[][] db) {

        String id_temp = id_pw[0];
        String password_temp = id_pw[1];

        String ans = "";

        for  (int i = 0; i < db.length; i++) {

            if (id_temp.equals(db[i][0])){

                if (password_temp.equals(db[i][1])){

                    ans = "login";

                    break;

                } else {

                    ans = "wrong pw";
                    break;

                }

            } else {

                ans = "fail";

            }

        }

        return ans;

    }

}