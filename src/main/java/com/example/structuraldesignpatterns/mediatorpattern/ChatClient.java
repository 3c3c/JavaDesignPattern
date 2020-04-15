package com.example.structuraldesignpatterns.mediatorpattern;

/**
 *中介者模式 降低耦合性
 *
 * 中介器模式在通信逻辑非常有用当对象是复杂的，我们可以有一个交流的中心点负责通信逻辑。
 *
 * 我们不应该仅仅为了实现低耦合而使用中介模式, 因为如果中介器的数量增加，它就会变成很难维持
 *
 */
public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Hi All");
    }
}
