# springboot-rabbitMq
springboot整合rabbitMq

#### 1.启动RabbitMq服务，可以进去管理界面http://127.0.0.1:15672/#/


#### 2.所依赖JAR（服务端和消费端）

 <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-amqp</artifactId>
 </dependency>


#### 3.配置文件（服务端和消费端）


spring.application.name=springboot-rabbit
spring.rabbitmq.host=127.0.0.1
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.publisher-confirms=true

#### 4.服务端

@Autowired
private AmqpTemplate template;
@Test
public void testRabbit() {
    for(int i = 1; i<= 10; i++){
        template.convertAndSend("队列名称","第"+i+"条");
    }
}

#### 5.消费端
@RabbitListener(queues="队列名称")    //监听器监听指定的Queue
public void receive(String str) {
    System.out.println("Receive:"+str);
}



