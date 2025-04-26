
import java.util.*;

class scalc27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Gender (Male/Female): ");
        String gender = sc.next();

        System.out.println("Enter Years of Service: ");
        int yearsOfService = sc.nextInt();

        System.out.println("Enter Qualifications (Graduate/Post-Graduate): ");
        String qualifications = sc.next();

        int salary = 0;

        if (gender.equalsIgnoreCase("Male")) {
            if (yearsOfService >= 10 && qualifications.equalsIgnoreCase("Post-Graduate")) {
                salary = 55000;
            } else if (yearsOfService >= 10 && qualifications.equalsIgnoreCase("Graduate")) {
                salary = 50000;
            } else if (yearsOfService < 10 && qualifications.equalsIgnoreCase("Post-Graduate")) {
                salary = 50000;
            } else if (yearsOfService < 10 && qualifications.equalsIgnoreCase("Graduate")) {
                salary = 30000;
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (yearsOfService >= 10 && qualifications.equalsIgnoreCase("Post-Graduate")) {
                salary = 50000;
            } else if (yearsOfService >= 10 && qualifications.equalsIgnoreCase("Graduate")) {
                salary = 35000;
            } else if (yearsOfService < 10 && qualifications.equalsIgnoreCase("Post-Graduate")) {
                salary = 50000;
            } else if (yearsOfService < 10 && qualifications.equalsIgnoreCase("Graduate")) {
                salary = 30000;
            }
        }

        System.out.println("The calculated salary is: Rs. " + salary);
    }
}
