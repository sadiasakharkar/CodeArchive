package Thread_And_Methods;

class Mythread extends Thread {
    private String threadname;

    public Mythread(String name){
        this.threadname = name;
    }
    @Override
    public void run(){
        for(int i = 0 ; i <=5; i++){
            System.out.println(threadname +"- iteration " +i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted! "+ e.getMessage());
            }
            System.out.println( threadname + " Executed!!!");
        }
    }
}
public class Joinmethod {
    public static void main(String[] args) {
       Mythread t1 = new Mythread("Thread 1");
       Mythread t2 = new Mythread("Thread 2");
       Mythread t3 = new Mythread("Thread 3");
       
       t1.start();
       t2.start();
       t3.start();

       try{
           t1.join();
           System.out.println("Main thread is waiting to thread t1 to complete!");

           t2.join();
           System.out.println("Main thread is waiting to thread t2 to complete!");

           t3.join();
           System.out.println("Main thread is waiting thread t3 to complete!");
       } catch(InterruptedException e){
        Thread.currentThread().interrupt();
        System.out.println("The main thread interrupted! "+ e.getMessage());
       }

       System.out.println("All threads executed! Main thread exiting now!");
    }
}
