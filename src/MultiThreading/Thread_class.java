package MultiThreading;

public class Thread_class extends Thread {
    int num;
    Thread_class(int num){
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" number is :"+num);
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread_class tc1=new Thread_class(56);
        Thread_class tc2=new Thread_class(15);
        Thread_class tc3=new Thread_class(34);
        tc1.start();
        tc2.start();
        //tc2.join();
        tc3.start();

    }
}
