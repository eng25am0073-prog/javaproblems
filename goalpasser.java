import java.util.Scanner;

public class goalpasser {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = sc.next();

        String result = command
                .replace("()", "o")
                .replace("(al)", "al");

        System.out.println("Interpretation: " + result);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
