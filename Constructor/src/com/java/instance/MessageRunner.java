package com.java.instance;

public class MessageRunner {

	public static void main(String[] args) {
	  Message msg=new Message();
	  msg.show();
	  Message msg2=new Message("me");
        msg2.show();
        Message msg3=new Message("frnd");
        msg3.show();
        Message msg4=new Message(true);
        msg4.show();
        Message msg5=new Message(00000);
        msg5.show();
	}

}
