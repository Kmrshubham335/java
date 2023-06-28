package Multi_Thread;
class MyThread extends Thread{
    public void run(){
        System.out.println("IN side run method");
    }
}
public class Create_Thread {
    public static void main(String[] args) {
        System.out.println("Main thread"); 
        MyThread t=new MyThread();
        t.start();
            
    }
}
