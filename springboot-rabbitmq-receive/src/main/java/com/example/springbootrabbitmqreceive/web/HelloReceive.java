package com.example.springbootrabbitmqreceive.web;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceive {

    @RabbitListener(queues="www")    //监听器监听指定的Queue
    public void receive(String str) {
        System.out.println("Receive:"+str);
    }

    @RabbitListener(queues="www")    //监听器监听指定的Queue
    public void receive2(String str) {
        System.out.println("Receive2:"+str);
    }

//    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
//    public void process1(String str) {
//        System.out.println("message:"+str);
//    }
//    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
//    public void process2(String str) {
//        System.out.println("messages:"+str);
//    }
}
