package Thread;

public class ImplementingRunnableInterface implements Runnable{
        @Override
        public void run(){
            for(int i = 0; i < 5; i++){
                System.out.println("Child Thread is running!"+ i);
            }
        }

        public static void main(String[] args){
            ImplementingRunnableInterface iri = new ImplementingRunnableInterface();
            Thread t = new Thread(iri);
            t.start();
            System.out.println("Main thread is running!");
        }
}
