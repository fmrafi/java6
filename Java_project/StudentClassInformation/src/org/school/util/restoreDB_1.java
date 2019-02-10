/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.school.util;

/**
 *
 * @author Rafiq
 */
public class restoreDB_1 {
public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {

        String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName,"-e", "source "+source};

        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            } else {
                System.out.println("Could not restore the backup");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
}
public static void main(String args[]){
    restoreDB_1 a=new restoreDB_1();
    a.restoreDB("mbstu", "root", "ict", "\"C:/New Folder/table.sql\"");
}
}
