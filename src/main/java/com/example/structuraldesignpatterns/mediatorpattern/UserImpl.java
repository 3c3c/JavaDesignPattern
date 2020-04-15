package com.example.structuraldesignpatterns.mediatorpattern;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediatorl, String name) {
        super(mediatorl, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + "使用中间人发送消息");
        mediatorl.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + "接收的消息:"+msg);
    }
}
