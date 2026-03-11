import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPatternMap patternMap = new CharacterPatternMap();

        // Print banner row by row
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.getPattern(ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Static Inner Class for managing character patterns
     */
    static class CharacterPatternMap {

        private final Map<Character, String[]> patternMap;

        public CharacterPatternMap() {
            patternMap = new HashMap<>();

            patternMap.put('O', new String[]{
                    "*****",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*****"
            });

            patternMap.put('P', new String[]{
                    "*****",
                    "*   *",
                    "*   *",
                    "*****",
                    "*",
                    "*",
                    "*"
            });

            patternMap.put('S', new String[]{
                    "*****",
                    "*",
                    "*",
                    "*****",
                    "    *",
                    "    *",
                    "*****"
            });
        }

        public String[] getPattern(char ch) {
            return patternMap.get(ch);
        }
    }
}
