package cn.shop.server1.kafka;

import cn.shop.server1.utils.BeanUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author buchengyin
 * @Date 2018/12/6 10:31
 **/
@Component
public class MessageConsumer {

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer1(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consuemr1 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer2(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer2 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }


    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer3(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer3 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }


    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer4(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer4 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer5(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer5 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer6(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer6 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer7(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer7 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer8(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer8 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer9(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer9 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }

    @KafkaListener(topics = "test_demo2",groupId = "group1")
    public void consumer10(ConsumerRecord<?,String> record){
        String value = record.value();
        System.out.println("-------------------->consumer10 kafka:"+value+ " 当前消费者时间为:"+BeanUtils.getCurrentTime());
    }
}
