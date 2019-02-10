

package org.school.util;

import java.util.*;
import java.io.*;
public class tableBackup_1 {
public boolean tbBackup(String dbName, String tbName, String dbUserName, String dbPassword, String path) {

String executeCmd = "mysqldump -u " + dbUserName + " -p" + dbPassword +""
+ dbName +" –tables" + tbName + " -r " + path;

Process runtimeProcess;
try {
runtimeProcess = Runtime.getRuntime().exec(executeCmd);
int processComplete = runtimeProcess.waitFor();

if (processComplete == 0) {
System.out.println("Backup created successfully");
return true;
} else {
System.out.println("Could not create the backup");
}
} catch (Exception ex) {
ex.printStackTrace();
}
return false;
}
public static void main(String[] args){
tableBackup_1 bb = new tableBackup_1();
bb.tbBackup("mbstu","t_clazz", "root", "ict", "C:/New Folder/table.sql");

}
}