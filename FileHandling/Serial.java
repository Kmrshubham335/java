package FileHandling;
import java.io.*;
class Cricketer1 implements Serializable
{
     String name;
     int age;
     int runs;
    public Cricketer1(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}
public class Serial
{
    public static void main(String[] args) throws Exception
    {
        Cricketer1 c=new Cricketer1("Sachin", 44, 30000);
        FileOutputStream fos=new FileOutputStream("ss.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();    
    }
    
}