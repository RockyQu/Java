package com.java.javadesignpatterns.code.code1;

import android.util.Log;

/**
 *
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        Log.e("send","send MailSender");
    }
}