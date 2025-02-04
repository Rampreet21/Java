public class ix_constructs {
    
    int x, y, z;

    ix_constructs(int a, int b) {
        x = a;
        y = b;
        z = a + b;
        System.out.println(z);
    }
    public static void main(String[] args) {
        ix_constructs ob = new ix_constructs(4, 2);

    }

}
