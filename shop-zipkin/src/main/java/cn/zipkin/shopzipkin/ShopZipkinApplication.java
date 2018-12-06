package cn.zipkin.shopzipkin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableApolloConfig
@EnableZipkinServer
@EnableDiscoveryClient
public class ShopZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopZipkinApplication.class, args);
    }
}
