import java.util.Scanner;

public class Ztry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter Number: ");
            float a = in.nextFloat(); // 'float' is preferable over 'Float' (wrapper class)

            System.out.println("Sum: " + a); 
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            in.close(); // Closing Scanner to prevent memory leak
        }
    }
}
