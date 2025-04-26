
import java.util.*;
class yper29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ram's age: ");
        int ram = sc.nextInt();
        System.out.println("Enter Shyam's age: ");
        int shyam = sc.nextInt();
        System.out.println("Enter Ajay's age: ");
        int ajay = sc.nextInt();

        if (ram < shyam && ram < ajay) {
            System.out.println("Ram is the youngest.");
        } else if (shyam < ram && shyam < ajay) {
            System.out.println("Shyam is the youngest.");
        } else {
            System.out.println("Ajay is the youngest.");
        }
    }
}
