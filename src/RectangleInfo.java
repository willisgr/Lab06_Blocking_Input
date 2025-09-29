import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double height = 0;
        double width = 0;

        do {
            System.out.print("Enter rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while(height <= 0);

        do {
            System.out.print("Enter rectangle width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while(width <= 0);

        System.out.println("Area = " + (height * width));
        System.out.println("Perimeter = " + ((height + width) * 2));
        System.out.println("Diagonal length = " + Math.hypot(height, width));
    }
}
