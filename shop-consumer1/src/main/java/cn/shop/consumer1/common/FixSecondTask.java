package cn.shop.consumer1.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author buchengyin
 * @Date 2018/12/6 10:44
 **/
@Component
public class FixSecondTask implements CommandLineRunner {
    private static final LinkedBlockingQueue<String>[] array = new LinkedBlockingQueue[60];
    private static volatile  int currentIndex =0;
    private static volatile  int preIndex = 59;
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    static {
        for(int i=0;i<60;i++){
            array[i] = new LinkedBlockingQueue<>();
        }
    }

    @Override
    public void run(String... args) throws Exception {
        for(;;){
            LinkedBlockingQueue<String> data = array[currentIndex];
            if(data!=null&&data.size()>0){
                for(;;){
                   String message =  data.poll();
                   if(message==null)
                       break;
                   int partition = new Random().nextInt(10);
                   kafkaTemplate.send("test_demo2",partition,"test",message);
                }
                data.clear();
            }
            preIndex =currentIndex;
            currentIndex = (currentIndex>=59?0:(currentIndex+1));
            Thread.sleep(1000);
        }
    }

    public static void addMessage(String message){
        LinkedBlockingQueue<String> queue = array[preIndex];
        queue.offer(message);
    }
}
