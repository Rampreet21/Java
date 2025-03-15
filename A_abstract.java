abstract class A {

    abstract void sum();
}

class B extends A  {
     void sum() {
        int a = 23;
        int b = 34;
        int c = a + b;
        System.out.println("addition " + c);
    }
}

class Main {
    public static void main(String[] args) {
        B b  = new B();
        b.sum();
    }
}

