package com.atri.rsmapp.Chat;

import com.atri.rsmapp.User.UserObject;
import com.google.firebase.firestore.auth.User;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatObject implements Serializable {
    private String chatId;

    private ArrayList<UserObject> userObjectArrayList = new ArrayList<>();
    public ChatObject(String chatId){
        this.chatId = chatId;
    }

    public ArrayList<UserObject> getUserObjectArrayList() {
        return userObjectArrayList;
    }

    public String getChatId() {
        return chatId;
    }

    public void addUserToArrayList(UserObject mUser){
        userObjectArrayList.add(mUser);
    }

}
