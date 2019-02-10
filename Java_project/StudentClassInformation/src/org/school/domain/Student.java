/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.school.domain;

/**
 *
 * @author Rafiq
 */
public class Student {
    private String sID;
    private String studentName;
    private String mobileNo;
    private String DeptName;

    public Student(String sID, String studentName, String mobileNo, String DeptName) {
        this.sID = sID;
        this.studentName = studentName;
        this.mobileNo = mobileNo;
        this.DeptName = DeptName;
    }

    public Student() {

    }



   public void setsID(String sID) {

       this.sID = sID;
    }
   public void setStudentName(String studentName) {

       this.studentName = studentName;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

  public void setDeptName(String DeptName) {

      this.DeptName = DeptName;
    }
  public String getsID() {
        return sID;
    }
 public String getStudentName() {

     return studentName;
    }
  public String getMobileNo() {

        return mobileNo;
    }

    public String getDeptName() {

          return DeptName;
    }
 }
