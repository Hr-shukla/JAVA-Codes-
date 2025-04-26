
import java.util.*;
class rcheck28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five-digit number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        if (original == reversed) {
            System.out.println("The original and reversed numbers are equal.");
        } else {
            System.out.println("The original and reversed numbers are not equal.");
        }
    }
}
