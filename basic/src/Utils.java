import java.util.Scanner;

public class Utils {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.print("Int:");
        return scanner.nextInt();
    }

    public static String getStrLine() {
        System.out.print("StrLine:");
        return scanner.nextLine();
    }
    public static String getStr() {
        System.out.print("Str:");
        return scanner.next();
    }
}
