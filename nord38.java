import java.util.*;
class nord38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();


        if (num1 < num2 && num2 < num3) {
            System.out.println("Numbers are in increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Numbers are in decreasing order");
        } else {
            System.out.println("Numbers are neither in increasing nor decreasing order");
        }
    }
}
