import java.util.Scanner;

public class capital {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        boolean allUpper = true;
        boolean allLower = true;
        boolean firstUpperRestLower = true;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (!Character.isUpperCase(ch)) {
                allUpper = false;
            }

            if (!Character.isLowerCase(ch)) {
                allLower = false;
            }

            if (i == 0) {

                if (!Character.isUpperCase(ch)) {
                    firstUpperRestLower = false;
                }

            } else {

                if (!Character.isLowerCase(ch)) {
                    firstUpperRestLower = false;
                }
            }
        }

        if (allUpper || allLower || firstUpperRestLower) {
            System.out.println("Valid Capitalization");
        } else {
            System.out.println("Invalid Capitalization");
        }

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
