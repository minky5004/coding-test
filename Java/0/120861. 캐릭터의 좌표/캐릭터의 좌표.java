class Solution {

    public int[] solution(String[] keyinput, int[] board) {

        int[] now = new int[2];

        for (String s : keyinput) {

            switch (s) {
                case "up" -> {

                    if (now[1] > board[1] / 2 - 1) {
                        continue;
                    } else {
                        now[1]++;
                    }
                }
                case "down" -> {

                    if (now[1] <= -(board[1] / 2)) {
                        continue;
                    } else {
                        now[1]--;
                    }
                }
                case "left" -> {

                    if (now[0] <= -(board[0] / 2)) {
                        continue;
                    } else {
                        now[0]--;
                    }
                }
                case "right" -> {

                    if (now[0] > board[0] / 2 - 1) {
                        continue;
                    } else {
                        now[0]++;
                    }
                }
            }

        }
        return now;
    }
}