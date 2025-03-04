public class xii_function {

    public static void sum() {
        System.out.println("Grade: A");
    }

    public static void sum(String str) {
        System.out.println(str);
    }
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        sum();
        sum("Grade: B");
        sum(20, 30);
    }
}
