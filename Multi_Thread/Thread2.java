package Multi_Thread;
import java.util.Scanner;
class MyThread1 extends Thread{
    public void run(){
        String s = Thread.currentThread().getName();
        if(s.equals("Calc")){
            Calc();
        }
        else{
            msg();
        }
    }
    public void Calc(){
        int a,b,s=0;
        try (Scanner dis = new Scanner(System.in)) {
            System.out.println("Enter the number");
            a=dis.nextInt();
            b=dis.nextInt();
        }
        s=a+b;
        System.out.println(s);
    }
    public void msg(){
        System.out.println("Hello World");
        System.out.println("In the msg method");
    }
}
public class Thread2 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread1 th =new MyThread1();
        MyThread1 thh =new MyThread1();
        th.setName("Calc");
        thh.setName("Msg method");
        th.start();
        thh.start();
    }
}
