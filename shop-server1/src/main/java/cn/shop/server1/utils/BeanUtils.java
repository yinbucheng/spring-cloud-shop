package cn.shop.server1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author buchengyin
 * @Date 2018/12/6 11:01
 **/
public abstract class BeanUtils {

    public static String getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }
}
