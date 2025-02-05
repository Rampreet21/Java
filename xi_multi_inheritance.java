class A {
    public void first() {
        System.out.println("First Inheritance");
    }
}

class B extends A {
    public void second() {
        System.out.println("Second Inheritance");
    }
}

class C extends B {
    public void third(){
        System.out.println("Third Inheritance");
    }
}

public class xi_multi_inheritance {
    public static void main(String[] args) {

        C object = new C();
        object.first();
        object.second();
        object.third();
    }
}
