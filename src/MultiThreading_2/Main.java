package MultiThreading_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank b1=new Bank(20);
        Thread th1=new Thread(b1);
        Bank b2=new Bank(10);
        Thread th2=new Thread(b2);
        Bank b3=new Bank(30);
        Thread th3=new Thread(b3);

        th1.start();
        // th1.join();
        th2.start();
        th3.start();

    }
}