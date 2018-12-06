package cn.shop.consumer1;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
//开启apollo配置管理
@EnableApolloConfig
//开启服务发现客户端
@EnableDiscoveryClient
//开启feign也就是http调用
@EnableFeignClients
//开发kafka使用
@EnableKafka
public class ShopConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ShopConsumer1Application.class, args);
    }
}
