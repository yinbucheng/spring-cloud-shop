package cn.shop.server1.controller;

import cn.shop.server1.module.vo.ServerResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buchengyin
 * @Date 2018/12/5 22:48
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/success")
    public Object success(){
        return ServerResult.success();
    }


    @RequestMapping("/fail")
    public Object fail(){
        return ServerResult.fail();
    }

}
