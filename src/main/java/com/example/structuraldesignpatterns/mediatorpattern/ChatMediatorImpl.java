package com.example.structuraldesignpatterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者提供两个功能
 * 1,发送消息的功能
 * 2,中介者需要持有一批用户
 */
public class ChatMediatorImpl implements ChatMediator {
    protected List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : users ){
            if(u != user){
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
