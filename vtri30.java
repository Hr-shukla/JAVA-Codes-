
import java.util.*;

class vtri30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle 1: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter angle 2: ");
        int angle2 = sc.nextInt();
        System.out.println("Enter angle 3: ");
        int angle3 = sc.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
