package cn.eureka.shopregister;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//开启apollo配置 需要在resource目录下添加META-INF/app.properties 和apollo-env.properties
@EnableApolloConfig
//开启eureka 服务端
@EnableEurekaServer
@SpringBootApplication
public class ShopRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopRegisterApplication.class, args);
    }
}
