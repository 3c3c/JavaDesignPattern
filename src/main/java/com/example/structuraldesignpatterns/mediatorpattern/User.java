package com.example.structuraldesignpatterns.mediatorpattern;

/**
 * 1,指定用户的中介者
 * 2,用户拥有发送消息的方法
 * 3,用户拥有接收消息的方法
 */
public abstract class User {
    protected ChatMediator mediatorl;
    protected String name;

    public User(ChatMediator mediatorl, String name) {
        this.mediatorl = mediatorl;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
