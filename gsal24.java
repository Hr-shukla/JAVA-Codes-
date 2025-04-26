
import java.util.*;
class gsal24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        double hra, da, grossSalary;
        if (basicSalary < 1500) {
            hra = basicSalary * 0.1;
            da = basicSalary * 0.9;
        } else {
            hra = 500;
            da = basicSalary * 0.98;
        }
        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary = Rs. " + grossSalary);
    }
}
