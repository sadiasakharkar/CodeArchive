package Thread;

class Increment {
    int count = 0 ;
    
    public void count(String threadname){
        synchronized(this){
            count++;
            System.out.println(threadname + " incremented count to: " + count);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Increment i = new Increment();

        Thread t1 = new Thread(() -> {
            for(int j = 0 ; j < 3; j ++){
                i.count("Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for( int j = 0 ; j< 3 ; j++){
                i .count("Thread 2");
            }
        });

        t1.start();
        t2.start();
    }
}
