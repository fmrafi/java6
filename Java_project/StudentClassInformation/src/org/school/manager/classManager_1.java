

package org.school.manager;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import java.util.Date;

import java.util.List;
import org.school.domain.clazz_1;
import org.school.util.DBConnection;


public class classManager_1 {
  public static boolean isSaveClassWithPrepared_1(clazz_1 stClass)
    {
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return false;
            }

             // String strClazz = "Insert into t_clazz (cID,classDate) values (?,?)";
             String strClazz = "insert into t_clazz (cID, classDate) values (?, ?)";

              PreparedStatement pst = con.prepareStatement(strClazz);
              pst.setString(1, stClass.getcId());            
        
              pst.setString(2, stClass.getClassDate());
                //pst.setString(2, stClass.getCalend());
              // pst.setDate(2,null,stClass.getCalend());
               //System.out.println(strClazz);
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
     public static List<clazz_1> getClasses()
     {
         List<clazz_1> classList = new ArrayList<clazz_1>();
        try {
            Connection con = DBConnection.getConnection();
            if(con == null)
            {
                return classList;
            }
            String sql = "Select * from t_clazz";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            clazz_1 clazz;
            while(rs.next())
            {
                clazz = new clazz_1();
                /*student.setId(rs.getString(1));
                student.setStudentName(rs.getString(2));
                student.setMobileNo(rs.getString(3));
                student.setDeptName(rs.getString(4));*/
                clazz.setcId(rs.getString("cID"));
                clazz.setClassDate(rs.getString("classdate"));

                classList.add(clazz);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return classList;

     }
}
