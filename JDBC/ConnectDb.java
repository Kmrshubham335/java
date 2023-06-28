package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
class ConnectDb{
    public static void main(String[] args) {
       try {
        //connection establish
        String url="jdbc:mysql://thin//localhost:3306/";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url,username, password);
        //statement created
        Statement stt = con.createStatement();

        // execute query
        String query="Create database Database1";
        stt.execute(query);

        //connection close
        con.close();
        System.out.println("Database created successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();

       } 
    }
}