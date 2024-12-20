package Thread_And_Methods;

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running! " +Thread.currentThread().getName());
    }
}
public class Threadclass {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        t.start();
        t1.start();
        System.out.println("Main Thread is Running!" + Thread.currentThread().getName());
    }
}