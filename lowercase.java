import java.util.Scanner;

public class lowercase {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.toLowerCase();

        System.out.println("Lowercase string: " + result);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}