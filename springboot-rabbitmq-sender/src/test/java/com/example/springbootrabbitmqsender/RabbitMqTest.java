package com.example.springbootrabbitmqsender;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private AmqpTemplate template;

    @Test
    public void testRabbit() {
        for(int i = 1; i<= 10; i++){
            template.convertAndSend("www","第"+i+"条");
        }
    }
//    @Test
//    public void testTopic() {
//        for(int i = 0; i< 10; i++){
//            template.convertAndSend("exchange","topic.message","呜呜呜呜呜呜呜"+i);
//        }
//    }
}
