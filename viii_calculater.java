import java.util.*;

public class viii_calculater {

    public void add() {
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.print("Result: "+ result);
    }

    public void sub() {
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        result = num1 - num2;
        System.out.print("Result: "+ result);
    }

    public void mul() {
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        result = num1 * num2;
        System.out.print("Result: "+ result);
    }

    public void div() {
        float num1, num2; 
        float result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextFloat();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextFloat();
        result = num1 / num2;
        System.out.print("Result: "+ result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        viii_calculater ob = new viii_calculater();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divition");
        System.out.print("Choose 1 to 4: ");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                ob.add();
                break;
            case 2:
                ob.sub();
                break;
            case 3:
                ob.mul();
                break;
            case 4:
                ob.div();
                break;
            default:
                System.out.println("!! Invalid choice !!");
        }
    }

}
