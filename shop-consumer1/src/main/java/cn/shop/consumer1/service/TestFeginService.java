package cn.shop.consumer1.service;

import cn.shop.consumer1.service.impl.TestFallBackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author buchengyin
 * @Date 2018/12/5 22:50
 **/
@FeignClient(value = "shop-server1",fallback = TestFallBackServiceImpl.class)
public interface TestFeginService {

    @RequestMapping("/test/success")
     Object success();

    @RequestMapping("/test/fail")
    Object fail();
}
