class Solution {

    public int[] solution(int[] num_list) {

        int [] temp =num_list.clone();
        
        for (int i = 0; i < num_list.length; i++) {
            
            num_list[i] = temp[num_list.length - i - 1];
            
        }

        return num_list;

    }

}