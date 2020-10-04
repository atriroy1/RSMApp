package com.atri.rsmapp.User;

import java.io.Serializable;

public class UserObject implements Serializable {
    private String uid, name, phone, notificationKey;
    private Boolean selected = false;

    public UserObject(String uid, String name, String phone){
        this.uid = uid;
        this.name = name;
        this.phone  = phone;

    }

    public UserObject(String uid){
        this.uid = uid;

    }

    public String getNotificationKey() {
        return notificationKey;
    }

    public void setNotificationKey(String notificationKey) {
        this.notificationKey = notificationKey;
    }

    public Boolean getSelected() {
        return selected;
    }

    public String getPhone() {return phone;}
    public String getName() {return name;}
    public String getUid() {
        return uid;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
