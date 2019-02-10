
package org.school.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.school.domain.Admin;
import org.school.util.DBConnection;

public class AdminManager {
    public static boolean isSaveWithPrepared(Admin adm){

        try{
            Connection con=DBConnection.getConnection();
            if(con==null){
                return false;
            }
         String strAdmin="insert into t_admin(adName,adPassword)values(?,?)";
        PreparedStatement pst = con.prepareStatement(strAdmin);

        pst.setString(1, adm.getName());
        pst.setString(2, adm.getPassword());
         
           pst.addBatch();



            pst.executeBatch();
            pst.close();
            con.close();
        return true;


        }catch(SQLException ae)
        {
        ae.printStackTrace();
            return false;
        }

    }

}
