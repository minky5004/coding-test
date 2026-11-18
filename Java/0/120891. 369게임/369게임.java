class Solution {

    public int solution(int order) {

        int count = 0;

        String [] temp = Integer.toString(order).split("");

        for (String s : temp) {

            String[] num1 = s.split("");

            for (String string : num1) {

                if (string.equals("3") || string.equals("6") || string.equals("9")) {

                    count++;

                }

            }

        }

        return count;

    }
}