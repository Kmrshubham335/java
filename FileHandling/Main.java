package FileHandling;
import java.io.File;
public class Main 
{
    public static void main(String[] args) {
        File file =new File("C:/Users/KIIT/Documents/java/FileHandling/NewFile.txt");
        if(file.exists())
        {
            System.out.println("File found");

            //file path
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
        }
        else{
            System.out.println("File not found");
        }
    }
    
}
