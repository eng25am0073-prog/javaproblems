import java.util.Scanner;

public class arrayequal {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in first array: ");
        int n1 = sc.nextInt();

        String[] arr1 = new String[n1];

        System.out.println("Enter first array:");

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        System.out.print("Enter number of strings in second array: ");
        int n2 = sc.nextInt();

        String[] arr2 = new String[n2];

        System.out.println("Enter second array:");

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String s : arr1) {
            s1.append(s);
        }

        for (String s : arr2) {
            s2.append(s);
        }

        if (s1.toString().equals(s2.toString())) {
            System.out.println("Arrays are equivalent");
        } else {
            System.out.println("Arrays are not equivalent");
        }

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
