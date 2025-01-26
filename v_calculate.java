import java.util.Scanner;

public class v_calculate {
    public static void main(String[] args){
        Scanner dlip = new Scanner(System.in);

        System.out.println("      Enter Your Marks");
        System.out.print("Math: ");
        int M = dlip.nextInt();

        System.out.print("English: ");
        int E = dlip.nextInt();
        
        System.out.print("Punjabi: ");
        int P = dlip.nextInt();
        
        System.out.print("Hindi: ");
        int H = dlip.nextInt();

        double to =M+E+P+H;
        int to2 =M+E+P+H;
        double per = to/400*100;
        System.out.println("Total Marks: "+to2);
        System.out.print("Percentage Marks: "+per+"%");

    }
}
