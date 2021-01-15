package AdapterMode.ClassAdapterMode;

public class Main {

    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("Hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
