package FileHandling;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Cricketer1 implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Cricketer1(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class Dserial {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("ss.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer1 cr = (Cricketer1) ois.readObject();
        cr.disp();

        ois.close();
    }
}
