class Solution {
    public int solution(String my_string) {
        
        String[] a = my_string.split(" ");

        int ans = Integer.parseInt(a[0]);
        
        for (int i = 0; i < a.length; i++) {

            switch (a[i]) {
                case "+" -> {
                    
                    int x = Integer.parseInt(a[i + 1]);

                    ans += x;

                }
                case "-" -> {
                    
                    int x = Integer.parseInt(a[i + 1]);

                    ans -= x;
                }
                
            }
        }

        return ans;
    }
}