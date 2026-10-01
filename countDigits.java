class Solution {
    public int countDigits(int num) {
         int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;  // Get last digit

            if (original % digit == 0) {
                count++;
            }

            num = num / 10;        // Remove last digit
        }

        return count;
        
    }
}