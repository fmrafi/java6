/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.school.util;

import java.io.*;
public class sampledb1 {

  public static void main(String[] args) {


  try {



  Runtime rt = Runtime.getRuntime();

  rt.exec("/C:/Program Files/MySQL/MySQL Server 5.0/bin/mysqldump -u [root] -p[ict]  [ mbstu] -r  /D:/databasebackup/backup.sql");
 }

 catch(IOException ioe)
  {
   ioe.printStackTrace();
  }

  catch(Exception e) {
  e.printStackTrace();
 }
}
}
