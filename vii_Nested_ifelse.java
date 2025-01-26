import java.util.Scanner;

public class vii_Nested_ifelse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number: ");
        int num2 = in.nextInt();
        System.out.print("Enter Number: ");
        int num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest number is: "+ num1);
            } else {
                System.out.println("The greatest number is: "+ num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The greatest number is: "+ num2);
            } else {
                System.out.println("The greatest number is: "+ num3);
            }
        }
    }
}