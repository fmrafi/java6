import java.sql.*;
public class AB{
static Connection con=null;
public static void main(String args[]){
System.out.println("Table Create");
try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

 con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");
 try{
Statement st=con.createStatement();
String table = "CREATE TABLE Student_3(id varchar(20), name varchar(20),home varchar(20))";
st.executeUpdate(table);

System.out.println("Table creation process successfully!");

}
catch(Exception e){System.out.println("Table all ready Exist");}
con.close();
}

catch(Exception e){e.printStackTrace();}


    }

   }