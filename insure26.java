
import java.util.*;
class insure26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you married? (yes/no): ");
        String married = sc.next();
        if (married.equals("yes")) {
            System.out.println("Driver is insured");
        } else {
            System.out.print("Enter gender (male/female): ");
            String gender = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            if (gender.equals("male") && age > 30) {
                System.out.println("Driver is insured");
            } else if (gender.equals("female") && age > 25) {
                System.out.println("Driver is insured");
            } else {
                System.out.println("Driver is not insured");
            }
        }
    }
}
