

package org.school.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import org.school.util.DBConnection;


public class DBJTable {

public Vector getEmployee()throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();

Connection conn = DBConnection.getConnection();
PreparedStatement pre = conn.prepareStatement("select * from t_student");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> t_student = new Vector<String>();
t_student.add(rs.getString(1)); //Empid
t_student.add(rs.getString(2)); //name
t_student.add(rs.getString(3)); //position
t_student.add(rs.getString(4)); //department
employeeVector.add(t_student);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;
}
}
