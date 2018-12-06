package cn.shop.consumer1.controller;

import cn.shop.consumer1.common.FixSecondTask;
import cn.shop.consumer1.service.TestFeginService;
import cn.shop.consumer1.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buchengyin
 * @Date 2018/12/5 22:53
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestFeginService feginService;

    @RequestMapping("/success")
    public Object success(){
        return feginService.success();
    }

    @RequestMapping("/fail")
    public Object fail(){
        return feginService.fail();
    }

    @RequestMapping("/sendMessage")
    public Object sendMessage(String message){
        FixSecondTask.addMessage(message+" 当前生产者的时间:"+BeanUtils.getCurrentTime());
        return "send to server";
    }
}
