package Thread_And_Methods;

class Mythread extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Thread " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted! "+ e.getMessage());
            }
        }
    }
}
public class SleepMethod {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();

        for(int i = 0 ; i<5 ; i++){
            System.out.println("Main Thread " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Main Thread Interrupted! "+ e.getMessage());
            }
        }
    }
}
