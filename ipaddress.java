import java.util.Scanner;

public class ipaddress {

    static void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = sc.next();

        String result = ip.replace(".", "[.]");

        System.out.println("Defanged IP address: " + result);

        sc.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
