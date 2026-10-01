import java.util.Scanner;

public class length {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        int lastSpace = str.lastIndexOf(' ');

        int length;

        if (lastSpace == -1) {
            length = str.length();
        } else {
            length = str.length() - lastSpace - 1;
        }

        System.out.println("Length of last word: " + length);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
