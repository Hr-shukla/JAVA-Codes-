import java.util.*;
class mfive40 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " is a multiple of 5");
        } else {
            System.out.println(num + " is not a multiple of 5");
        }
    }
}
