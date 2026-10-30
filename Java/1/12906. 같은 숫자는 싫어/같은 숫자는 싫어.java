import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> dq = new Stack<>();

        for (int i : arr){
            if (dq.isEmpty() || !dq.peek().equals(i)){
                dq.push(i);
            }
        }

        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}