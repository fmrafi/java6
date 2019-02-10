

package org.school.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.school.domain.attendence;
import org.school.util.DBConnection;


public class attendenceManager {

     public static boolean isSaveAttendenceWithPrepared(attendence atdence)
    {
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return false;
            }
            String strStudent = "Insert into t_attendance (aID,clazz_id,student_id,student_status) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(strStudent);


               pst.setString(1, atdence.getaID());
                pst.setString(2, atdence.getSt_status());
                pst.setString(3, atdence.getStudent().getsID());
               pst.setString(4, atdence.getClazz().getcID());
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

}
