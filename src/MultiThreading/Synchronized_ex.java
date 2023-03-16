package MultiThreading;
public class Synchronized_ex {
    public void S_method(int n) {

        synchronized (this) {
            for(int i=1;i<10;i++){
                System.out.println(i*n);
            }
        }
    }
}
class Demo1 extends Thread{
    Synchronized_ex se;
    Demo1(Synchronized_ex se){
        this.se=se;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" ");
        se.S_method(6);

    }
}
class Demo2 extends Thread{
    Synchronized_ex se1;
    Demo2(Synchronized_ex se1){
        this.se1=se1;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" ");
        se1.S_method(4);

    }
}

class Test_case{
    public static void main(String[] args) throws InterruptedException {
        Synchronized_ex obj=new Synchronized_ex();
        Demo1 d0=new Demo1(obj) ;
        Demo2 d1=new Demo2(obj);
        d0.start();
        d0.join();
        d1.start();
//        d1.join();

    }
}