import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double tankSize = 0;
        double milesPerGallon = 0;
        double gasPrice = 0;

        do {
            System.out.print("Enter your fuel tank size in gallons: ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while(tankSize <= 0);

        do {
            System.out.print("Enter your fuel efficiency(MPG): ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while(milesPerGallon <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while(gasPrice <= 0);

        // (100 miles / mpg) * gas price
        System.out.println("Cost to drive 100 miles: " + ((100 / milesPerGallon) * gasPrice));
        // tank size * miles per gallon
        System.out.println("Mile you can drive on a full tank: " + (tankSize * milesPerGallon));
    }
}
