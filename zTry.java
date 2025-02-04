class Student {
    String name;
    int age;
    String course;

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with three parameters
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob", 20);
        Student s3 = new Student("Charlie", 22, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
    }
}
