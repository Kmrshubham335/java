package FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWrite {
    public static void main(String[] args) {
        try{
            //reading a file
        FileReader fr =new FileReader("C:/Users/KIIT/Documents/java/FileHandling/NewFile.txt");

        //writing a file
        FileWriter fw = new FileWriter("C:/Users/KIIT/Documents/java/FileHandling/NewFile.txt");

        //writing in the file
        fw.write("hello I its my first file creation in java.");
        //append at last
        fw.append("Thanks");

        // reading a file
        int data =fr.read();
        while(data!=-1){
            System.out.println((char)data);
            data=fr.read();
        }
        fw.close();
        fr.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
