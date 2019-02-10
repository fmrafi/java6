

package org.school.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.school.domain.Student;
import org.school.util.DBConnection;

public class StudentManager {
  public static boolean isSaveStudentWithPrepared(Student student)
    {
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return false;
            }
            String strStudent = "Insert into t_student (sID,studentName,mobileNo, deptName) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(strStudent);

                pst.setString(1, student.getsID());
                pst.setString(2, student.getStudentName());
                pst.setString(3, student.getMobileNo());
                pst.setString(4, student.getDeptName());
                pst.addBatch();

            pst.executeBatch();
            pst.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }
public static List<Student> getStudents()
   {
       List<Student> studentList = new ArrayList<Student>();
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return studentList;
            }
            String sql = "Select * from t_student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Student student;
            while(rs.next())
            {
                student = new Student();
                /*student.setId(rs.getString(1));
                student.setStudentName(rs.getString(2));
                student.setMobileNo(rs.getString(3));
                student.setDeptName(rs.getString(4));*/
                student.setsID(rs.getString("sID"));
                student.setStudentName(rs.getString("studentName"));
                student.setMobileNo(rs.getString("mobileNo"));
                student.setDeptName(rs.getString("deptName"));
                studentList.add(student);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return studentList;
    }

}
