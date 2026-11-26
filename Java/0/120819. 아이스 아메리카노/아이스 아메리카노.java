class Solution {

    public int[] solution(int money) {

        int temp = 0;

        while (money >= 5500) {

            temp++;
            money -= 5500;

        }

        int[] answer = new int[2];

        answer[0] = temp;
        answer[1] = money;

        return answer;

    }

}