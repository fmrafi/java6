
package org.school.domain;


public class attendence {
    private String aID;
    private Student student;
    private clazz clazz;
    private String st_status;

    public attendence(String aID, Student student, clazz clazz, String st_status) {
        this.aID = aID;
        this.student = student;
        this.clazz = clazz;
        this.st_status = st_status;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }

    public void setClazz(clazz clazz) {
        this.clazz = clazz;
    }

    public void setSt_status(String st_status) {
        this.st_status = st_status;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getaID() {
        return aID;
    }

    public clazz getClazz() {
        return clazz;
    }

    public String getSt_status() {
        return st_status;
    }

    public Student getStudent() {
        return student;
    }

    
   

}
