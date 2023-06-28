//Thread synchronization-Two Thread acting on same object
package Multi_Thread;
class reserve implements Runnable{
    int avail=10;
    int wanted;
    reserve(int i){
        wanted=i;
    }
    public void run() {
        synchronized(this)
        {
            System.out.println("Available berths= "+ avail);
            if(avail>=wanted){
                String str1=Thread.currentThread().getName();
                System.out.println(wanted + "Berths reserved for " + str1);
            
            try{
                Thread.sleep(1500);
                avail=avail-wanted;
            }
            catch(InterruptedException ie){}
        }
        else System.out.println("Sorry no berths");
        }
    }
}
public class Threadsyn {
    public static void main(String[] args) {
        reserve r1=new reserve(5);
        Thread t1 =new Thread(r1);
        Thread t2= new Thread(r1);
        t1.setName("First person");
        t2.setName("Second person");
        t1.start();
        t2.start();
}
}