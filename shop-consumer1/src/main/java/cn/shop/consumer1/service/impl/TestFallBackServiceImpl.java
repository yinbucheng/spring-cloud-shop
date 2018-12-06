package cn.shop.consumer1.service.impl;

import cn.shop.consumer1.service.TestFeginService;
import org.springframework.stereotype.Component;

/**
 * @author buchengyin
 * @Date 2018/12/5 22:51
 **/
@Component
public class TestFallBackServiceImpl implements TestFeginService {
    @Override
    public Object success() {
        return "fallback invoke";
    }

    @Override
    public Object fail() {
        return "fallback invoke";
    }
}
