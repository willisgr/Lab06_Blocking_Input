import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String trash = "";
       boolean valid = false;
       double tempF = 0;
       double tempC = 0;

       do {
           System.out.print("Enter temperature in Fahrenheit: ");
           if (in.hasNextDouble()) {
               valid = true;
               tempF = in.nextDouble();
               in.nextLine();
           } else {
               trash = in.nextLine();
               System.out.println("Invalid input: " + trash);
               System.out.println("Please enter a valid number");
           }
       } while(!valid);

       tempC = (tempF - 32) * ((double) 5 /9);
       System.out.println("Your temp in C is: " + tempC);
    }
}
