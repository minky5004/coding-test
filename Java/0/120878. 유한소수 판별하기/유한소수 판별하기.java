class Solution {

    public int solution(int a, int b) {

        while (b != 0) {

            if (b % 2 == 0) {

                b = b / 2;

            } else if (b % 5 == 0) {

                b = b / 5;

            } else {
                break;
            }

        }

        if (b == 1) {

            return 1;

        } else if (a % b == 0) {

            return 1;

        } else {

            return 2;

        }

    }
}