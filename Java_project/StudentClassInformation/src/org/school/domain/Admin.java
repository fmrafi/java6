

package org.school.domain;


public class Admin {

    private String name;
    private String password;



   
    public Admin(String name, String password) {
        this.name=name;
        this.password=password;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


   



}
