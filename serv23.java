
import java.util.*;
class serv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();
        System.out.print("Enter joining year: ");
        int joiningYear = sc.nextInt();
        int yearsOfService = currentYear - joiningYear;
        if (yearsOfService > 3) {
            System.out.println("Bonus of Rs. 2500 awarded");
        }
    }
}
