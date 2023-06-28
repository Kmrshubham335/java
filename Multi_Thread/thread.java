package Multi_Thread;

public class thread {
    public static void main(String[] args) {
        System.out.println("Main thread");
       String name= Thread.currentThread().getName(); //Name of the current thread
       System.out.println(name);
       int t=Thread.currentThread().getPriority();
       System.out.println("Priority of the main thread=" +t);
//Changing the name and priority of the main thread
       Thread s= Thread.currentThread();
       s.setName("New thread");
       s.setPriority(1);
       String name1=Thread.currentThread().getName();
       System.out.println("New name="+ name1);
       System.out.println(Thread.currentThread().getPriority());
}
}
