
import java.util.*;
class rcomp32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("The area is greater than the perimeter.");
        } else {
            System.out.println("The perimeter is greater than or equal to the area.");
        }
    }
}
