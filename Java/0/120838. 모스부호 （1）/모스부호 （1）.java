import java.util.Arrays;

class Solution {

    public String solution(String letter) {

        String answer = "";

        String[] letters = letter.split(" ");

        String[][] morse = {

                {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"},
                {"..-.", "f"}, {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"},
                {"-.-", "k"}, {".-..", "l"}, {"--", "m"}, {"-.", "n"}, {"---", "o"},
                {".--.", "p"}, {"--.-", "q"}, {".-.", "r"}, {"...", "s"}, {"-", "t"},
                {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"}, {"-.--", "y"},
                {"--..", "z"}

        };

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < morse.length; j++) {

                if (morse[j][0].equals(letters[i])) {

                    answer += morse[j][1];

                    break;
                }

            }

        }

        return answer;
    }

}