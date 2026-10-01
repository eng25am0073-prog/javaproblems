import java.util.Scanner;

public class commonfactors {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int limit = Math.min(a, b);

        System.out.println("Common factors are:");

        for (int i = 1; i <= limit; i++) {

            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
