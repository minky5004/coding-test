class Solution {

    public int solution(String[] spell, String[] dic) {

        int answer = 2;

        int idx;

        for (String string : dic) {

            idx = 0;

            for (String s : spell) {

                if (string.contains(s)) {

                    idx++;

                }

                if (idx == spell.length) {

                    answer = 1;

                }

            }

        }

        return answer;

    }

}