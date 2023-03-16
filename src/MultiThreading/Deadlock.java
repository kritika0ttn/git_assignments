package MultiThreading;

public class Deadlock {

      private static class Demo1 extends Thread{
        public void run(){
            System.out.println(Thread.currentThread().getName() +"  is operating on key-1");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName()+" is waiting for key-2");
        }
    }

    private static class Demo2 extends Thread{
        public void run(){
            System.out.println(Thread.currentThread().getName()+" is operating on key-2");
            try {
                Thread.sleep(280);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" is waiting for key-1");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d1.start();
        d2.start();



    }

}
