import java.util.*;
class gsteel33 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);   
	System.out.println("Enter hardness (integer): ");     
	int hardness = sc.nextInt();
	System.out.println("Enter carbon content (decimal): ");
        double carbonContent = sc.nextDouble();
	System.out.println("Enter tensile strength (integer): ");
        int tensileStrength = sc.nextInt();
        int grade;

        if (hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600) {
            grade = 10;
        } else if (hardness > 50 && carbonContent < 0.7) {
            grade = 9;
        } else if (carbonContent < 0.7 && tensileStrength > 5600) {
            grade = 8;
        } else if (hardness > 50 && tensileStrength > 5600) {
            grade = 7;
        } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
            grade = 6;
        } else {
            grade = 5;
        }
        System.out.println("Grade of Steel: " + grade);
    }
}
