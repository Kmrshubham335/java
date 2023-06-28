package Multi_Thread;
class Printing implements Runnable{
    public void run(){
        try{
        for(int i=0;i<3;i++){
            System.out.println("Inside run method");
            Thread.sleep(3000);
        }
    }
    catch(Exception e){
        System.out.println("Thread in sleep");
    }
}
}
public class Thread3 {
    public static void main(String[] args) {
        Printing th=new Printing();
        Thread t=new Thread(th);
        t.start();
        System.out.println(t.isAlive()); //True
        try {
            t.join(); // it execute the other thread before the main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ends");
        System.out.println("Main Threading execute");
        System.out.println("Main Thread complete");
    }
}