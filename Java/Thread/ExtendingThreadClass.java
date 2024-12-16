package Thread;

class A extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running! " + Thread.currentThread().getName());
    }
}

public class ExtendingThreadClass{
    public static void main(String[] args){
        A a = new A();
        a.start();
        System.out.println("Main Thread is running!" + Thread.currentThread().getName());
    }
}