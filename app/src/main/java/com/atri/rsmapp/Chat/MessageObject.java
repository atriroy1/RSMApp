package com.atri.rsmapp.Chat;

import android.os.Message;

import com.google.common.collect.ArrayTable;

import java.util.ArrayList;

public class MessageObject {
    String messageId,  senderId, senderName, message;


    ArrayList<String> mediaUrlList;
    public MessageObject(String messageId, String senderId, String message, String senderName, ArrayList<String> mediaUrlList){
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.senderName = senderName;
        this.mediaUrlList = mediaUrlList;

    }

    public ArrayList<String> getMediaUrlList() {
        return mediaUrlList;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {return message;}
    public String getMessageId() {return messageId;}
    public String getSenderId() {return senderId;}


}
