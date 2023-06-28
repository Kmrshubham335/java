package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class Student
{
    public void CreateDatabase(){
       try {
        //connection establish
        String url="jdbc:mysql://localhost:3306/";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url, username, password);
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
    public void CreateTable() {
     try {
        //creating a table
        String url="jdbc:mysql://localhost:3306/Database1";
        // String db = "Database1";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url ,username, password);
        //statement created
        Statement stt = con.createStatement();

        // query to table created
        String query="Create Table Student (sid int(3),sname varchar(200),roll int(5)) ";
        stt.execute(query);

        //connection close
        con.close();
        System.out.println("Table created successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();
       }
    }
    public void InsertintoTable()
    {
        try {
        String url="jdbc:mysql://localhost:3306/Database1";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url, username, password);

        //Insert into table
        String query = "INSERT into student (sid,sname,roll) VALUES('225','Abhishek','337')";

        //statement created
        PreparedStatement psttm =con.prepareStatement(query);
        psttm.execute(query);

        //connection close
        con.close();
        System.out.println("Insertion successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();
       }
    }
    public void readData()
    {
        //imp
        try {
        String url="jdbc:mysql://localhost:3306/Database1";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stt = con.createStatement();


        // execute query And table created
        String query="select * from student";
        ResultSet rs = stt.executeQuery(query);
        
        //retrieving  data from the table

        while(rs.next()){
            System.out.println("sid =" + rs.getInt(1));
            System.out.println("sname " + rs.getString(2));
            System.out.println("roll = " + rs.getInt(3));
        }

        //connection close
        con.close();
        System.out.println("Read successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();
       }
    }
    public void updateTable() {
        try {
        String url="jdbc:mysql://localhost:3306/Database1";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url, username, password);

        String query = "UPDATE Student SET sid = ? WHERE sname = ?";
        PreparedStatement psttm = con.prepareStatement(query);

            // Set parameter values
            psttm.setInt(1, 250);
            psttm.setString(2, "Shubham");

            // Execute update
            psttm.executeUpdate();

        //connection close
        con.close();
        System.out.println("Update  successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();
       }

}
    public void delete() {
     try {
        String url="jdbc:mysql://localhost:3306/Database1";
        String username ="root";
        String password = "1999@Shubham";
        Connection con = DriverManager.getConnection(url, username, password);

        String query = "DELETE from  Student where sid = ?";
        PreparedStatement psttm = con.prepareStatement(query);

            // Set parameter values
            psttm.setInt(1, 225);

            // Execute update
            psttm.executeUpdate();

        //connection close
        con.close();
        System.out.println("delete successful");
       } 
       catch (Exception e) 
       {
        // TODO: handle exception
        e.printStackTrace();
       }   

    }
}