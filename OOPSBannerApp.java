public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] letters = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        // Combine letters row by row
        for (int row = 0; row < 7; row++) {
            String line = String.join(" ",
                    letters[0][row],
                    letters[1][row],
                    letters[2][row],
                    letters[3][row]);
            System.out.println(line);
        }
    }

    // Letter O
    public static String[] buildO() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    // Letter P
    public static String[] buildP() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Letter S
    public static String[] buildS() {
        return new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }
}
