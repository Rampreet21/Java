interface Animal {

    int LEGS = 4;
    void makeSound();
}

class Dog implements Animal {

    public void makeSound() {
        System.out.println(LEGS);
    }
}

public class B_interface_variable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}