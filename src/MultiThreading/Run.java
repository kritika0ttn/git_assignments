package MultiThreading;
public class Run  implements Runnable{
    int num;
    public Run(int num){
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" number is :"+ num);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class Main{
    public static void main(String[] args) throws InterruptedException {
        Run r1=new Run(2);
        Thread t1=new Thread(r1);
        Run r2=new Run(6);
        Thread t2=new Thread(r2);
        t1.start();
        t1.join();
        t2.start();

    }
}
