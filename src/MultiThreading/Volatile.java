package MultiThreading;


public class Volatile extends Thread{
     volatile static int Count=10;
     void increment(){
        Count++;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running.");
        for(int i=0;i<10;i++){
            increment();
            System.out.println(Thread.currentThread().getName());
            System.out.println("count is :"+Count);
        }

    }

    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(new Volatile());
//        Thread t2 = new Thread(new Volatile());
        Volatile v1 = new Volatile();
        Volatile v2 = new Volatile();

//        t1.start();
//        System.out.println(t1.getState());
//        t1.join();
//        t2.start();
//        System.out.println(t2.getState());

        v1.start();
        System.out.println(v1.getState());
        v1.join();
        v2.start();
        System.out.println(v2.getState());


        System.out.println("All threads have completed their execution.");
    }
}
