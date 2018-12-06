package cn.shop.server1;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
@EnableKafka
public class ShopServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(ShopServer1Application.class, args);
    }
}
