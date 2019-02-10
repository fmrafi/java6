/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.school.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Rafiq
 */
public class DBConnection {
     public static Connection getConnection()
    {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"
                    + "localhost:3306/mbstu", "root","ict");
            System.out.println(" successfull connect");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;

    }
     private static Statement getStatement() throws Exception {
		Statement st = null;
		Connection con = getConnection();
		st = con.createStatement();
		return st;
	}
      
       public static boolean checkValue(String sql) throws Exception {
		boolean b = false;
		ResultSet rst = null;
		Statement st = getStatement();
		rst = st.executeQuery(sql);
		if (rst.next()) {
			b = true;
		}
		return b;

	}

     public static void main(String args[]){
         DBConnection a=new DBConnection();
         a.getConnection();

     }


}
