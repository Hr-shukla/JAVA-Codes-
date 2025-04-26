import java.util.*;
class weff35 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        double timeTaken = sc.nextDouble();

        if (timeTaken >= 2 && timeTaken <= 3) {
            System.out.println("Highly efficient");
        } else if (timeTaken > 3 && timeTaken <= 4) {
            System.out.println("Improve speed");
        } else if (timeTaken > 4 && timeTaken <= 5) {
            System.out.println("Given training to improve speed");
        } else {
            System.out.println("Leave the company");
        }
    }
}
