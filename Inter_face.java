interface A {
    void sum();
    void sub();
    void mul();
}
interface B extends A {
    void div(); 
}

class C implements B {
    public void sum() {
        int a = 23;
        int b = 34;
        int c = a + b;
        System.out.println("addition " + c);
    }
    public void sub() {
        int i = 12;
        int j = 12;
        int k = i - j;
        System.out.println("subtraction " + k);
    }
    public void mul() {
        int x = 45;
        int y = 6;
        int z = x * y;
        System.out.println("multiplication " + z);
    }
    public void div() {
        int a = 45;
        int b = 5;
        int c = a / b;
        System.out.println("divide " + c);
    }
}
public class Inter_face {
    public static void main(String[] args) {
        C rr = new C();
        rr.sum();
        rr.sub();
        rr.mul();
        rr.div();
    }
}