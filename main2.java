import java.util.*;
interface A {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    void sum();
    void sub();
}

interface B extends A {
    void mul();
}

class C implements B {
    public void sum() {
        System.out.println("Addtition "+ (a + b));
    }
    public void sub() {
        System.out.println("Subtraction "+ (a - b));
    }
    public void mul() {
        System.out.println("Multiply "+ (a * b));
    }

}

public class main2 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        C obj = new C();
        obj.sum();
        obj.sub();
        obj.mul();
    }
}