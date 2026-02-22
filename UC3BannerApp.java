public class UC3BannerApp {

    public static void main(String[] args) {

        printTopBorder();
        printEmptyLine();
        printTitle();
        printEmptyLine();
        printBottomBorder();
    }

    public static void printTopBorder() {
        String line = String.join("", "************************");
        System.out.println(line);
    }

    public static void printEmptyLine() {
        String line = String.join("", "*                      *");
        System.out.println(line);
    }

    public static void printTitle() {
        String line = String.join(" ", "*", "OOPS", "BANNER", "APP", "*");
        System.out.println(line);
    }

    public static void printBottomBorder() {
        String line = String.join("", "************************");
        System.out.println(line);
    }
}