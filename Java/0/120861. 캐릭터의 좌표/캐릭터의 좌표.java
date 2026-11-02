class Solution {

    public int[] solution(String[] keyinput, int[] board) {

        int[] now = new int[2];

        for (String s : keyinput) {

            if (s.equals("up")) {

                if (now[1] > board[1] / 2 - 1) {
                    continue;
                } else {
                    now[1]++;
                }

            } else if (s.equals("down")) {

                if (now[1] <= -(board[1] / 2)) {
                    continue;
                } else {
                    now[1]--;
                }

            } else if (s.equals("left")) {

                if (now[0] <= -(board[0] / 2)) {
                    continue;
                } else {
                    now[0]--;
                }

            } else if (s.equals("right")) {

                if (now[0] > board[0] / 2 - 1) {
                    continue;
                } else {
                    now[0]++;
                }

            }

        }
        return now;
    }
}