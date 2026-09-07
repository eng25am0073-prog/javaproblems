public class AddDigits {
    public static int AddDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;  // digital root formula
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(AddDigits(num)); // Output: 2
    }
}

    
