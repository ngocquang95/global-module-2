package ss3_static;

public class MyClass {
    static int a = 2;
    int b = 2;

    public static void change() {
        a = 3;
    }

    public void update() {
        a = 3;
        b = 3;
        change();
    }

    public static void main(String[] args) {
        MyClass m1 = new MyClass(); // m1.b = 2
        MyClass m2 = new MyClass(); // m2.b = 2

        m1.a++;
        m1.b++;

        m2.a++;
        m2.b++;

        System.out.println(m1.a); // result?  => 4
        System.out.println(m1.b); // result?  => 3
    }
}