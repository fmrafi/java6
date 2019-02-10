

package org.school.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import org.school.domain.clazz;

import org.school.util.DBConnection;


public class classManager {
  public static boolean isSaveStudentWithPrepared(clazz stClass)
    {
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return false;
            }
            String strClazz = "Insert into t_clazz (cID,classDate) values (?,?)";
            PreparedStatement pst = con.prepareStatement(strClazz);
                pst.setString(1, stClass.getcID());
                    long time = stClass.getDate().getTime();
                //pst.setDate(2, new Date(stClass.getDate().getTime()));
                pst.setDate(2, new Date(time));

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
