import java.util.*;
class libf34 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int daysLate = sc.nextInt();
        double fine;

        if (daysLate <= 5) {
            fine = daysLate * 0.50;
        } else if (daysLate <= 10) {
            fine = (5 * 0.50) + (daysLate - 5) * 1;
        } else if (daysLate <= 30) {
            fine = (5 * 0.50) + (5 * 1) + (daysLate - 10) * 5;
        } else {
            System.out.println("Membership cancelled");
            return;
        }
        System.out.println("Fine: " + fine + " rupees");
    }
}
