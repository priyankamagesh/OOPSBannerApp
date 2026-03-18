public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines inside an array
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
