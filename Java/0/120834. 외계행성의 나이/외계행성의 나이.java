class Solution {

    public String solution(int age) {

        String temp = String.valueOf(age);

        String[] arr =  temp.split("");

        String answer = "";

        for (int i = 0; i < arr.length; i++) {

            char ch = (char) (Integer.parseInt(arr[i]) + 'a');
            
            answer += ch;
        }
        
        return answer;

    }

}
