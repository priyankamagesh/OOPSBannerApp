public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration and initialization in one statement
        String[] banner = {

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        " ******",
                        " ******"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*      "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "****** ",
                        " ***** "),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "      *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join("   ",
                        "*     *",
                        "*     *",
                        "*      ",
                        "*     *"),

                String.join("   ",
                        " ***** ",
                        " ***** ",
                        "*      ",
                        " ***** ")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
