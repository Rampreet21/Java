interface Animal {

    int LEGS = 4;
    void makeSound();
}

class Dog implements Animal {

    public void makeSound() {
        System.out.println(LEGS);
    }
}

public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}