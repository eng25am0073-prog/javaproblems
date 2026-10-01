import java.util.Scanner;

public class reversprefix {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.next();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int index = word.indexOf(ch);

        if (index == -1) {

            System.out.println("Character not found");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = index; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        for (int i = index + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }

        System.out.println("Result: " + result);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}