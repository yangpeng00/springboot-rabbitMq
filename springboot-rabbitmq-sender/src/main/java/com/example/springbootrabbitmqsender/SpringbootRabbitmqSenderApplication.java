package com.example.springbootrabbitmqsender;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootRabbitmqSenderApplication {
	//direct模式
	@Bean
	public Queue queue() {
		return new Queue("www");
	}
//	//Topic转发模式
//	@Bean(name="message")
//	public Queue queueMessage() {
//		return new Queue("topic.message");
//	}
//
//	@Bean(name="messages")
//	public Queue queueMessages() {
//		return new Queue("topic.messages");
//	}
//
//	@Bean
//	public TopicExchange exchange() {
//		return new TopicExchange("exchange");
//	}
//
//	@Bean
//	Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage, TopicExchange exchange) {
//		return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
//	}
//
//	@Bean
//	Binding bindingExchangeMessages(@Qualifier("messages") Queue queueMessages, TopicExchange exchange) {
//		return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
//		//*表示一个词,#表示零个或多个词
//	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootRabbitmqSenderApplication.class, args);
	}

}
