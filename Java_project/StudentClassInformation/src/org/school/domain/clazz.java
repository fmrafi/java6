/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.school.domain;

import java.util.Date;


public class clazz {

    private String cID;
    private Date date;

    public clazz(String cID, Date date) {
        this.cID = cID;
        this.date = date;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getcID() {
        return cID;
    }

    public Date getDate() {
        return date;
    }

}
