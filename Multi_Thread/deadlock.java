package Multi_Thread;
class BookTicket extends Thread{
    Object train,comp;
    BookTicket(Object train ,Object comp)
    {
        this.train = train;
        this.comp = comp;
    }
    public void run(){
        //lock on train
        synchronized (train){
            System.out.println("BookTicket locked on train");
            try{
                Thread.sleep(150);
        }catch(InterruptedException ie){}
    }
    System.out.println("BookTicket now waiting to lock on compartment");
    synchronized(comp){
        System.out.println("BookTicket locked on compartment");
    }
}
}
class CancelTicket extends Thread{
    Object train,comp;
    CancelTicket(Object train,Object comp){
        this.train = train;
        this.comp = comp;
    }
    public void run(){
        synchronized(comp){
            System.out.println("CancelTicket waiting to lock on compartment");
            try{
                Thread.sleep(200);
            }catch(InterruptedException ie){}
            System.out.println("CancelTicket now waiting on  locked on train");
            synchronized(train){
                System.out.println("CancelTicket locked on Train ");
            }
}
}
}
public class deadlock {
 public static void main(String[] args) {
    Object train = new Object();
    Object comp = new Object();
    BookTicket b = new BookTicket(train,comp);
    CancelTicket c = new CancelTicket(train,comp);
    Thread t1=new Thread(b);
    Thread t2=new Thread(c);
    t1.start();
    t2.start();
 }   
}
