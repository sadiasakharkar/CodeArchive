package Thread;

class Increment {
    private int count = 0;

    public synchronized void incrementCount(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to: " + count);
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MethodLevelSynchronization{
    public static void main(String[] args) {
        Increment i = new Increment();

        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 5; j++) { // Renamed the loop variable
                i.incrementCount("Thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for( int j = 0 ; j< 5; j++){
                i.incrementCount("Thread 2");
            }
        });

        t1.start();
        t2.start();
    }
}
