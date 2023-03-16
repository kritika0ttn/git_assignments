package java_9;

import java.io.*;
public class Q8{
    public static void main(String[] args) {
        try (the2 d = new the2();
             the1 d1 = new the1();
             the3 d2 = new the3()
        ) {
            d.display();
            d1.display1();
            d2.display2();
            int x = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
class the2 implements Closeable {
    void display() { System.out.println("TTN1 "); }
    public void close()
    {
        System.out.println("Closable close 0f 1");
    }
}
class the1 implements AutoCloseable {
    void display1()
    { System.out.println("TTN2"); }
    public void close()
    {
        System.out.println("Autoclosble close of 2");
    }

}class the3 implements AutoCloseable {
    void display2()
    { System.out.println("TTN3"); }
    public void close()
    {
        System.out.println("Autoclosble close of 3");
    }
}