import java.util.*;

public class reverse_numberr{
    public int reverse(int num) {
        int rev = 0;
        
        for (int i = num; i != 0; i /= 10) {
            int digit = i % 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }
        
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        Solution solution = new Solution();
        int reversedNumber = solution.reverse(num);

        System.out.println("Reversed number is: " + reversedNumber);
        sc.close();
    }
}
