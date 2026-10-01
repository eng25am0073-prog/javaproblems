import java.util.Scanner;

public class revers{

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}